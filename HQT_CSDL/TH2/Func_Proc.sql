USE PHAN_PHOI_NUOC_GIAI_KHAT
--1. Tạo thủ tục sp _ngk liệt kê tất cả nước giải khát và loại nước giải khát tương ứng

--GO
--CREATE PROC SP_NGK 
--AS 
--SELECT *
--FROM NGK INNER JOIN LOAINGK ON NGK.MaLoaiNGK = LOAINGK.MaLoaiNGK

--GO

EXECUTE SP_NGK





--2. Tạo thủ tục sp_ncc cho biết thông tin về nhà cung cấp với mã nhà cung cấp là tham số đầu vào

GO
CREATE or alter PROC SP_NCC (@MANCC VARCHAR(10))
AS
SELECT *
FROM NHACC
WHERE NHACC.MaNCC = @MANCC

GO


EXECUTE SP_NCC 'NC1'





--3. Tạo thủ tục sp_ton hiển thị thông tin nước giải khát chưa bán được
--GO
--CREATE PROC SP_TON
--AS
--SELECT * 
--FROM NGK
--WHERE NGK.MaNGK NOT IN (
--						SELECT CT_HOADON.MaNGK
--						FROM CT_HOADON)
--GO


EXECUTE SP_TON

--4. Tạo thủ tục sp_dt tinh tổng doanh thu của năm (với năm là tham số đầu vào và doanh thu là tham số đầu ra)
--GO
--CREATE PROC SP_DT (@YEAR INT , @DT INT OUTPUT)
--AS
--SELECT @DT= SUM(B1.TIEN)  
--FROM (SELECT SLKHMua*DGBan AS TIEN
--		FROM CT_HOADON INNER JOIN HOADON ON HOADON.SoHD = CT_HOADON.SoHD
--		WHERE YEAR(HOADON.NgaylapHD) = @YEAR) 
--		AS B1
 

--GO

DECLARE @DT INT	
EXECUTE SP_DT @YEAR=2010, @DT=@DT OUTPUT;
SELECT @DT AS DOANHTHU




--5. Tạo thủ tục sp_tong_dt tinh tổng doanh thu của năm (với năm là tham số đầu vào và doanh thu là tham
--số đầu ra)







--6. Tạo thủ tục sp_danhsach liệt kê n loại nước giải khát bán chạy nhất (doanh thu) trong tháng (với n và tháng là tham số đầu vào)
--GO
--CREATE PROC SP_DANHSACH (@N INT, @MONTH INT )
--AS 
--SELECT TOP (@N) NGK.TenNGK, B1.MaNGK ,SUM(TIEN) AS DOANHTHU
--FROM (SELECT  MaNGK ,SLKHMua*DGBan AS TIEN
-- 		FROM CT_HOADON INNER JOIN HOADON ON HOADON.SoHD = CT_HOADON.SoHD		
--		WHERE MONTH(HOADON.NgaylapHD) = @MONTH)
--		AS B1
--		INNER JOIN NGK   NGK ON NGK.MaNGK = B1.MaNGK
--GROUP BY  NGK.TenNGK, B1.MaNGK
--GO

EXECUTE SP_DANHSACH @N =2, @MONTH= 6






--7. Tạo thủ tục sp_insert_CTPGH nhận vào các tham số tương ứng với thông tin của một dòng trong chi
--tiết phiếu giao hàng, nếu các điều kiện sau đây được thỏa mãn thì thêm dòng mới tương ứng với các thông
--tin đã cho vào Table CT_PGH:
-- SoPGH phải tồn tại trong table PGH
-- MaNGK ứng với SoDDH phải tồn tại trong table CT_DDH
-- SLGiao<=SLDAT
--Thông báo nếu điều kiện trên bị vi phạm


GO
CREATE OR ALTER PROC sp_insert_CTPGH  (@SoPGH VARCHAR(10), @MaNGK VARCHAR(10), @SLGiao INT, @DGGiao INT )
AS
	IF @SoPGH NOT IN (
						SELECT SoPGH
						FROM PHIEUGH)
			PRINT 'Phiếu giao hàng ko tồn tại'
	ELSE IF @MaNGK NOT IN (
							SELECT CT_DDH.MaNGK
							FROM PHIEUGH INNER JOIN DDH ON PHIEUGH.SoDDH = DDH.SoDDH
									INNER JOIN CT_DDH ON CT_DDH.SoDDH = DDH.SoDDH
							WHERE PHIEUGH.SoPGH = @SoPGH)

			PRINT 'Sai MÃ NGK'
	ELSE IF @SLGiao <=  (SELECT CT_DDH.SLDat
							FROM PHIEUGH INNER JOIN DDH ON PHIEUGH.SoDDH = DDH.SoDDH
									INNER JOIN CT_DDH ON CT_DDH.SoDDH = DDH.SoDDH
							WHERE PHIEUGH.SoPGH = @SoPGH
								AND @MaNGK = CT_DDH.MaNGK)

				BEGIN
				INSERT INTO CT_PGH(SoPGH, MaNGK, SLGiao, DGGiao) VALUES 
					(@SoPGH, @MaNGK, @SLGiao, @DGGiao)

				PRINT 'Insert du lieu thanh cong'
				END
			 


	ELSE 
		PRINT 'Số lượng giao hàng sai'
		 

EXECUTE sp_insert_CTPGH @SoPGH = 'PGH01', @MaNGK ='WT1', @SLGiao =20, @DGGiao =20000






--8. Tạo thủ tục có tên sp_delete_CTPH nhận vào các tham số tương ứng với thông tin của một dòng trong
--chi tiết phiếu hẹn, thực hiện các yêu cầu sau: Xóa dòng trương ứng trong chi tiết phiếu hẹn
-- Nếu phiếu hẹn tương ứng không còn dòng chi tiết thì xóa luôn phiếu hẹn đó


GO
CREATE OR ALTER PROC sp_delete_CTPH (@SoPH VARCHAR(10), @MaNGK VARCHAR(10) , @SLHen INT )
AS
	IF EXISTS ( 
			SELECT * 
			FROM CT_PH  
			WHERE SoPH = @SoPH
				AND MaNGK = @MaNGK
				AND SLHen = @SLHen)

			BEGIN 
				DELETE FROM CT_PH 
				WHERE CT_PH.SoPH = @SoPH
					AND CT_PH.MaNGK = @MaNGK
					AND SLHen = @SLHen
				PRINT 'Da xoa 1 chi tiet phieu hen'
			END

	ELSE IF @SoPH NOT IN (
							SELECT CT_PH.SoPH
							FROM CT_PH)
		BEGIN
			DELETE FROM PHIEUHEN
			WHERE PHIEUHEN.SoPH = @SoPH

			PRINT 'Da xoa 1 phieu hen'
			
		END

	ELSE 
		PRINT 'KHONG THE THUC HIEN'


EXECUTE sp_delete_CTPH @SoPH = 'PH03', @MaNGK = 'WT1', @SLHen = 100;


 




--Function
--1. Tạo hàm f_list có 2 tham số là @Ngay1 và @Ngay2 cho biết danh sách các NGK đã được bán trong
--khoảng thời gian trên. Danh sách gồm các thuộc tính: MaNGK, TenNGK, DVT, SoLuong.
--GO
--CREATE OR ALTER FUNCTION f_list (@NGAY1 DATE, @NGAY2 DATE)
--RETURNS TABLE 
--AS
--RETURN (
--	SELECT NGK.MaNGK, NGK.TenNGK, CT_HOADON.SLKHMua
--	FROM NGK INNER JOIN CT_HOADON ON NGK.MaNGK = CT_HOADON.MaNGK
--			INNER JOIN HOADON ON HOADON.SoHD = CT_HOADON.SoHD
--	WHERE HOADON.NgaylapHD BETWEEN @NGAY1 AND @NGAY2 
--	)



SELECT * FROM f_list('2010-05-10', '2010-07-08' )






--2. Tạo hàm f_max cho biết ĐĐH đã đặt NGK với số lượng nhiều nhất so với các ĐĐH khác có đặt NGK
--đó. Thông tin hiển thị: SoDDH, MaNGK, [SL đặt nhiều nhất].

--GO
--CREATE OR ALTER FUNCTION f_max ()
--RETURNS TABLE 
--AS
--RETURN (
--		SELECT CT_DDH.SoDDH, CT_DDH.MaNGK,  SUB.SLMAX
--		FROM (
--				SELECT CT_DDH.MaNGK, MAX(CT_DDH.SLDat) AS SLMAX
--				FROM CT_DDH 
--				GROUP BY CT_DDH.MaNGK) AS SUB
--				INNER JOIN CT_DDH ON CT_DDH.MaNGK = SUB.MaNGK
--								AND CT_DDH.SLDat = SUB.SLMAX
		
		

--		)

SELECT * FROM f_max()





--3. Tạo hàm f_kh hiển thị thông tin của khách hàng có giao dịch với cửa hàng nhiều nhất (căn cứ
--vào số lần mua hàng).

--GO
--CREATE OR ALTER FUNCTION f_kh()
--RETURNS TABLE 
--AS
--RETURN (
--		SELECT KH.MaKH, KH.TenKH, KH.DTKH, COUNT(*) AS SOLANMUA
--		FROM KH
--		INNER JOIN HOADON ON HOADON.MaKH = KH.MaKH
--		GROUP BY KH.MaKH, KH.TenKH, KH.DTKH
--		HAVING COUNT(*) >= ALL (
--								SELECT COUNT(*)
--								FROM HOADON
--								GROUP BY HOADON.MaKH)
--		)
--GO



SELECT * FROM f_kh()



--4. Tạo hàm f_xlkh nhận vào tham số @MaKH, tính tổng tiền khách hàng đã trả
--(TongTien=sum(SLKHMua*DGBan)). Sau đó hàm trả về kết quả xếp loại khách hàng như sau:
-- Nếu TongTien>800.000 : xếp loại “KH VIP”
-- Nếu TongTien>500.000 : xếp loại “KH THÀNH VIÊN”
-- Nếu TongTien<=500.000 : xếp loại “KH THÂN THIẾT”

GO
CREATE OR ALTER FUNCTION f_xlkh (@MaKH VARCHAR(10))
RETURNS VARCHAR(50)
AS
BEGIN
	DECLARE @SUM NUMERIC(18, 2)
	DECLARE @RESULT VARCHAR(50)
	SELECT @SUM = (
						SELECT SUM(CT_HOADON.SLKHMua * CT_HOADON.DGBan)
						FROM HOADON 
							INNER JOIN  CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD
						WHERE HOADON.MaKH = @MaKH
						GROUP BY HOADON.MaKH
						)


	IF @SUM > 800000
		SET @RESULT = 'KH VIP'
	
	ELSE IF @SUM >500000
		SET @RESULT=  'KH THANH VIEN'
	
	ELSE 
		SET @RESULT= 'KH THAN THIET'


	RETURN @RESULT
END

GO


SELECT  dbo.f_xlkh('KH01') AS LOAIKH