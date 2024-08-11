USE PHAN_PHOI_NUOC_GIAI_KHAT
--Trigger

--1. Tạo trigger PH _insert trên bảng PHIEUHEN kiểm tra ràng buộc toàn vẹn sau đây mỗi khi thêm một
--dòng vào bảng PHIEUHEN:
-- MaKH phải tồn tại tron bảng KH
-- Ngày hẹn giao không thể trước ngày lập phiếu hẹn.
GO
CREATE OR ALTER TRIGGER  PH_insert
ON PHIEUHEN
INSTEAD OF INSERT
AS
BEGIN
	IF EXISTS (
				SELECT 1
				FROM inserted
				WHERE  NgayHenGiao < NgaylapPH
					OR	MaKH NOT IN (SELECT KH.MaKH
								FROM KH))
					
		BEGIN
			RAISERROR ('MA KH KHONG TON TAI hoac NGAY HEN GIAO SAI', 16,1)
			ROLLBACK TRANSACTION
		END


	ELSE
		BEGIN
			INSERT INTO PHIEUHEN(MaKH, NgayHenGiao, NgaylapPH, SoPH) 
			SELECT MaKH, NgayHenGiao, NgaylapPH, SoPH
			FROM inserted

		END


END


GO


INSERT INTO PHIEUHEN(MaKH, NgayHenGiao, NgaylapPH, SoPH) VALUES
	('DSDS', '2022-12-12', '2021-12-12', 'PH1')





--2. Tạo trigger CTPH _insert trên bảng CT_PH kiểm tra ràng buộc toàn vẹn sau đây mỗi khi thêm một
--dòng vào bảng CT_PH:”Tổng số lượng hẹn cho mỗi MaNGK không vượt quá 20”

GO
CREATE OR ALTER TRIGGER CTPH_insert
ON CT_PH
INSTEAD OF INSERT
AS
BEGIN
	IF EXISTS (
				SELECT 1
				FROM inserted i JOIN CT_PH ON CT_PH.SoPH = i.SoPH 
				GROUP BY CT_PH.MaNGK 
				HAVING Sum ( CT_PH.SLHen ) >20 )

		BEGIN
			RAISERROR ('SO LUONG HEN QUA LON', 16,1)
			ROLLBACK TRANSACTION 
		END


	ELSE
		BEGIN
			INSERT INTO CT_PH (SoPH, MaNGK, SLHen)
			SELECT SoPH, MaNGK, SLHen
			FROM inserted
		END


END

GO

INSERT INTO CT_PH(SoPH, MaNGK, SLHen) VALUES
	('PH01', 'PS1', 2),
	('PH02', 'PS2', 20)



SELECT MaNGK, SUM(SLHen)
FROM CT_PH
GROUP BY MaNGK








--3. Viết trigger PT_insert trên bảng PHIEUTRANO kiểm tra ràng buộc toàn vẹn sau đây mỗi khi thêm một
--dòng vào bảng PHIEUTRANO:“ Khách hàng chỉ được trả tối đa 3 lần cho mỗi hóa đơn”
GO
CREATE OR ALTER TRIGGER PT_insert
ON PHIEUTRANO
INSTEAD OF INSERT
AS
BEGIN

	IF EXISTS  (
			SELECT 1
			FROM  inserted i  JOIN PHIEUTRANO ON PHIEUTRANO.SoHD = i.SoHD
												
			GROUP BY PHIEUTRANO.SoHD
			HAVING COUNT(*) >= 3)
			
		

		BEGIN

		RAISERROR ('Khách hàng chỉ được trả tối đa 3 lần cho mỗi hóa đơn', 16,1)
		ROLLBACK TRANSACTION 
		
		END


	
	ELSE
		BEGIN

		INSERT INTO PHIEUTRANO(SoPTN, NgayTra, SoTienTra,  SoHD) 
		SELECT SoPTN, NgayTra, SoTienTra, SoHD
		FROM inserted
		PRINT 'THANH CONG'

		END

END
GO
 

INSERT INTO PHIEUTRANO(SoPTN, NgayTra, SoTienTra,  SoHD) VALUES
	('PTN39',	'2010-05-18',	5000,	'HD01')






--4. Viết trigger HD_update trên bảng HOADON kiểm tra ràng buộc toàn vẹn sau đây mỗi khi cập nhật một
--dòng trên bảng HOADON:
-- Không được cập nhật SoHD
-- MaKH phải tồn tại trong bảng KH
-- NgaylapHD <= Ngày hiện tại




GO
CREATE OR ALTER TRIGGER HD_update
ON HOADON
INSTEAD OF UPDATE
AS
BEGIN

	

	IF EXISTS (
		SELECT 1
		FROM inserted I, deleted D 
		WHERE I.SoHD <> D.SoHD
		)

		BEGIN
			RAISERROR ('kHONG DUOC THAY DOI SoHD', 16,1)
			ROLLBACK TRANSACTION
		END

		 



	IF  EXISTS (
		SELECT I.MaKH
		FROM inserted I
		WHERE I.MaKH NOT IN (
					SELECT KH.MaKH
					FROM KH))

		BEGIN
			RAISERROR ('KH KHONG TON TAI', 16,1)
			ROLLBACK TRANSACTION
		END
	


	IF  EXISTS (
		SELECT 1
		FROM inserted I
		WHERE I.NgaylapHD > GETDATE() )

		BEGIN
			RAISERROR ('NGAY SAI', 16,1)
			ROLLBACK TRANSACTION
		END
	



	ELSE
		BEGIN 
			UPDATE HOADON
			SET		
				HOADON.MaKH = I.MaKH,
				HOADON.NgaylapHD = I.NgaylapHD

				FROM inserted I
				WHERE I.SoHD = HOADON.SoHD

			PRINT 'THANH CONG'

		END
END
GO


UPDATE HOADON
SET 
	SoHD='HD02',
	MaKH='KH03',
	NgaylapHD='2021-02-02'
WHERE SoHD='HD02'






--5.Tạo trigger CTHD _insert trên bảng CT_HD kiểm tra ràng buộc toàn vẹn sau đây mỗi khi thêm một 
--dòng vào bảng CT_HD: “Mỗi hóa đơn có tối đa 10 dòng chi tiết” 

GO
CREATE OR ALTER TRIGGER CTHD_insert
ON CT_HOADON
INSTEAD OF INSERT
AS
BEGIN
	IF EXISTS (	
				SELECT 1
				FROM inserted I INNER JOIN CT_HOADON ON I.SoHD = CT_HOADON.SoHD
				GROUP BY CT_HOADON.SoHD
				HAVING COUNT(*) >5
				)
	
		BEGIN
			RAISERROR ('Mỗi hóa đơn có tối đa 10 dòng chi tiết', 16,1)
			ROLLBACK TRANSACTION
		END

	ELSE
		BEGIN
			INSERT INTO CT_HOADON (SoHD, MaNGK,SLKHMua,  DGBan) 
			SELECT I.SoHD, I.MaNGK, I.SLKHMua, I.DGBan
			FROM inserted I 
		END
END
GO

SELECT *
FROM CT_HOADON
WHERE SoHD='HD05'

INSERT INTO CT_HOADON (SoHD,MaNGK, SLKHMua,  DGBan) VALUES
('HD05','NO2',	80	,9000)



--6. Để tránh đơn hàng ảo, tạo trigger HD_insert, kiểm tra ràng buộc mỗi khi insert hoặc update bảng 
--HOADON: 
--“Mỗi khách hàng chi được mua tối đa 3 đơn hàng trong ngày”  





GO
CREATE OR ALTER TRIGGER HD_insert
ON HOADON
INSTEAD OF INSERT
AS
BEGIN
    
    IF EXISTS (
        SELECT I.MaKH, I.NgaylapHD
        FROM inserted I
        GROUP BY I.MaKH, I.NgaylapHD
        HAVING (
            SELECT COUNT(*)
            FROM HOADON H
            WHERE H.MaKH = I.MaKH AND H.NgaylapHD = I.NgaylapHD
        ) + COUNT(*) > 3
    )
    BEGIN
        RAISERROR ('Mỗi khách hàng chỉ được mua tối đa 3 đơn hàng trong ngày', 16, 1)
        ROLLBACK TRANSACTION
    END
    ELSE
    BEGIN
        
        INSERT INTO HOADON (SoHD, NgaylapHD, MaKH) 
        SELECT I.SoHD, I.NgaylapHD, I.MaKH
        FROM inserted I 
    END
END
GO









SELECT *
FROM HOADON
WHERE MaKH = 'KH02'
	AND NgaylapHD = '2010-06-05'

SELECT COUNT(*)
FROM HOADON
WHERE MaKH = 'KH02'
	AND NgaylapHD = '2010-06-05'
GROUP BY MaKH, NgaylapHD

INSERT INTO HOADON (SoHD,NgaylapHD,   MaKH) VALUES
('HD11','2010-06-05','KH02')








--7. Thêm thuộc tính tổng tiền(TONGTIEN) vào bảng HODON. Tạo trigger tính giá trị TONGTIEN sau khi 
--insert hoặc update bảng CT_HOADON


ALTER TABLE HOADON
ADD TONGTEN INT;

DROP TRIGGER HD_update 


GO
CREATE OR ALTER TRIGGER trg_CTHOADON_Update
ON CT_HOADON
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    -- Cập nhật TONGTIEN cho các hóa đơn bị ảnh hưởng
    UPDATE HOADON
    SET TONGTEN = (
        SELECT SUM(CT.SLKHMua * CT.DGBan)
        FROM CT_HOADON CT
        WHERE CT.SoHD = HOADON.SoHD
    )
   
END

GO



INSERT INTO CT_HOADON (SoHD,MaNGK, SLKHMua,  DGBan) VALUES
('HD02','sv1',	80	,1)


select *
from CT_HOADON

SELECT * 
FROM HOADON
