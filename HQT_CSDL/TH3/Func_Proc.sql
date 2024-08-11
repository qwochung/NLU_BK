--Functions:
--1. Tạo hàm F_DTB cho biết điểm trung bình các môn thi của học viên. Mỗi môn thi, chỉ lấy điểm của lần thi
--sau cùng (mã học viên là tham số của hàm).
 

--GO
--CREATE OR ALTER  FUNCTION F_DTB(@MaHV VARCHAR(10))

--RETURNS FLOAT	
--AS
	
--BEGIN 
--			DECLARE @DTB FLOAT;
--			SELECT @DTB= AVG(B1.DIEM)  
--			FROM (
--				SELECT  MAHV,MAMH,DIEM ,MAX(KETQUATHI.LANTHI) AS LANTHI
--				FROM KETQUATHI
--				WHERE MAHV = @MaHV
--				GROUP BY KETQUATHI.MAMH, DIEM, MAHV
--			)  AS B1
--				INNER JOIN HOCVIEN ON HOCVIEN.MAHV = B1.MAHV
--				INNER JOIN KETQUATHI ON KETQUATHI.MAMH = B1.MAMH
--										AND KETQUATHI.MAHV = B1.MAHV
--										AND KETQUATHI.LANTHI = B1.LANTHI

		
--			GROUP BY HOCVIEN.TEN

		
--	RETURN @DTB		

--END		
--GO




SELECT dbo.F_DTB('K1102') AS DIEMTB;











 
				

--2. Tạo hàm F_XL có mã học viên là tham số, cho biết kết quả xếp loại của học viên như sau:
-- Nếu DIEMTB ≥ 9 thì XEPLOAI =”XS”
-- Nếu 8 ≤ DIEMTB < 9 thì XEPLOAI = “G”
-- Nếu 6.5 ≤ DIEMTB < 8 thì XEPLOAI = “K”
-- Nếu 5 ≤ DIEMTB < 6.5 thì XEPLOAI = “TB”
-- Nếu DIEMTB < 5 thì XEPLOAI = ”Y” .

 

--GO
--CREATE OR ALTER FUNCTION F_XL (@MaHV VARCHAR(10))
--RETURNS VARCHAR(50)
--BEGIN
--	DECLARE @RESULT VARCHAR(50)
--	DECLARE @DTB FLOAT
--	SET @DTB = (SELECT dbo.F_DTB(@MaHV) )

--	IF @DTB < 5 SET @RESULT='Y'
--	ELSE IF @DTB >=5 AND @DTB <6.5  SET @RESULT='TB'
--	ELSE IF @DTB >=6.5 AND @DTB <8 SET @RESULT ='K'
--	ELSE IF @DTB >=8 AND @DTB <9 SET @RESULT ='G'
--	ELSE IF @DTB >=9 SET @RESULT ='XS'
					
--	RETURN @RESULT 
--END;
--GO

SELECT dbo.F_XL('K1102')







--3. Tạo hàm F_DSMON cho biết danh sách điểm các môn học mà học viên có kết quả ‘đạt’.
-- Danh sách gồm: MAMH, TENMH, ĐIỂM
-- Mã học viên là tham số của hàm

--GO
--CREATE OR ALTER FUNCTION F_DSMON(@MaHV VARCHAR(10))
--RETURNS TABLE
--AS

--RETURN (
--		SELECT  MONHOC.MAMH, MONHOC.TENMH, KETQUATHI.DIEM
--		FROM KETQUATHI 
--			INNER JOIN MONHOC ON KETQUATHI.MAMH = MONHOC.MAMH
--		WHERE KETQUATHI.MAHV = @MaHV AND KETQUATHI.KQUA ='DAT'

--			)


--GO

SELECT * FROM F_DSMON('K1101')





--4. Tạo hàm F_DSGV cho biết danh sách giáo viên đã dạy hết các môn mà khoa phụ trách. Hàm có tham
--số là mã khoa


--GO
--CREATE OR ALTER FUNCTION F_DSGV (@MaKHOA VARCHAR(10))
--RETURNS TABLE 
--AS
--RETURN (
--		SELECT GIAOVIEN.MAGV, GIAOVIEN.HOTEN, GIAOVIEN.MAKHOA
--		FROM GIAOVIEN INNER JOIN 
--					(SELECT    B1.MAGV
--						FROM (
--							SELECT GIANGDAY.MAGV, GIANGDAY.MAMH
--							FROM GIANGDAY INNER JOIN (
--								SELECT MONHOC.MAMH
--								FROM KHOA INNER JOIN MONHOC ON MONHOC.MAKHOA = KHOA.MAKHOA
--							WHERE KHOA.MAKHOA = 'KHMT') AS DSMON
--									ON DSMON.MAMH = GIANGDAY.MAMH
--						) AS B1
 
--						GROUP BY B1.MAGV
--							HAVING COUNT(DISTINCT B1.MAMH) = (SELECT COUNT(DISTINCT MH.MAMH) 
--                                      FROM MONHOC MH 
--                                      WHERE MH.MAKHOA = @MaKhoa)) AS B2
--			ON GIAOVIEN.MAGV= B2.MAGV
--		)
--GO



SELECT * FROM F_DSGV('KHMT');




--5. Tạo hàm trả về danh sách học viên và kết quả xếp loại từng học viên của lớp.
-- Thông tin gồm: MAHV, Họ & tên HV, Điểm trung bình, xếp loại.
-- Mã lớp là tham số của hàm

--GO
--CREATE OR ALTER FUNCTION F_DSLop(@MaLop VARCHAR(10))
--RETURNS TABLE
--AS
--RETURN
--(
--    SELECT 
--        HV.MAHV,
--        HV.HO + HV.TEN AS HoTen,
--		dbo.F_DTB(HV.MAHV) AS DiemTB,
--		dbo.F_XL(HV.MAHV) AS XepLoai
	
        
--    FROM 
--        HOCVIEN HV
--    WHERE 
--        HV.MALOP = @MaLop
--);
--GO




SELECT * FROM dbo.F_DSLop('K12');








--Procedures:

--1. Tạo thủ tục P_KQMH, cho biết bảng điểm của học viên (p_mahv).
-- Thông tin gồm: Mã học viên, tên học viên, mã môn học, tên môn học, điểm (chỉ lấy điểm của lần
--thi cuối cùng), kết quả
-- Thủ tục nhận tham số đầu vào là mã học viên (p_mahv)

--GO 
--CREATE OR ALTER PROC P_KQMH (@MaHV VARCHAR(10))
--AS
--SELECT *
--FROM KETQUATHI INNER JOIN 
--			(SELECT KETQUATHI.MAHV, KETQUATHI.MAMH, MAX(KETQUATHI.LANTHI) AS LANTHICUOI
--			FROM  KETQUATHI
--			WHERE KETQUATHI.MAHV = @MaHV
--			GROUP BY KETQUATHI.MAHV, KETQUATHI.MAMH 
			
--				) AS B1 

--			ON KETQUATHI.MAHV = B1.MAHV
--				AND KETQUATHI.MAMH = B1.MAMH
--				AND KETQUATHI.LANTHI = B1.LANTHICUOI
 
--GO

EXECUTE P_KQMH 'K1102'











--2. Tạo thủ tục P_GVMH, cho biết danh sách sinh viên học môn (p_mamh) do giáo viên (p_mgv) phụ trách
--trong học kỳ (p_hocky), năm học (p_nam).
-- Thông tin gồm: Mã GV, mã môn học, mahv, ho&ten hoc vien
-- Thủ tục nhận các tham số đầu vào là mã môn học (p_mamh), mã giáo viên (p_mgv), học kỳ
--(p_hocky), năm học (p_nam).


--GO
--CREATE OR ALTER PROC P_GVMH (@p_mamh VARCHAR(10),@p_mgv VARCHAR(10),@p_hocky INT, @p_nam INT )
--AS
--SELECT *
--FROM GIANGDAY GD INNER JOIN LOP ON LOP.MALOP = GD.MALOP
--			INNER JOIN HOCVIEN ON LOP.MALOP = HOCVIEN.MALOP
--WHERE GD.MAGV = @p_mgv
--	AND GD.MAMH = @p_mamh
--	AND GD.HOCKY = @p_hocky
--	AND GD.NAM = @p_nam


--GO

EXECUTE P_GVMH 'CSDL', 'GV05', 2,2006











--3. Tạo thủ tục P_LOP cho biết danh sách học viên của lớp (p_malop).
-- Thông tin gồm: mã lớp, mgvcn, tên gv chủ nhiệm, tên trưởng lớp, mahv, ho&ten học viên.
-- Thủ tục nhận 1 tham số đầu vào là mã lớp (p_malop).


-- sub lớp trưởng
GO
CREATE OR ALTER FUNCTION F_LOPTRUONG (@p_malop VARCHAR(10))
RETURNS TABLE
AS 
RETURN (SELECT LOP.MALOP,LOP.TRGLOP, HOCVIEN.HO, HOCVIEN.TEN
		FROM HOCVIEN INNER JOIN LOP ON LOP.MALOP = HOCVIEN.MALOP
		WHERE LOP.MALOP =  @p_malop
				AND LOP.TRGLOP = HOCVIEN.MAHV)
GO



 
 -- sub giáo viên
GO
CREATE OR ALTER FUNCTION F_GIAOVIEN (@p_malop VARCHAR(10))
RETURNS TABLE
AS 
RETURN (
		SELECT LOP.MALOP, GIAOVIEN.MAGV, GIAOVIEN.HOTEN
		FROM GIAOVIEN INNER JOIN LOP ON LOP.MAGVCN = GIAOVIEN.MAGV
		WHERE LOP.MALOP =@p_malop)

GO




GO
CREATE OR ALTER PROC P_LOP (@p_malop VARCHAR(10))
AS
SELECT LOP.MALOP, T_GIAOVIEN.MAGV, T_GIAOVIEN.HOTEN, T_LOPTRUONG.HO + T_LOPTRUONG.TEN AS HOTENLOPTRG, HOCVIEN.MAHV, HOCVIEN.HO + HOCVIEN.TEN AS HOTENHV

FROM LOP INNER JOIN (SELECT * FROM dbo.F_LOPTRUONG(@p_malop) ) AS T_LOPTRUONG ON LOP.MALOP = T_LOPTRUONG.MALOP
																			AND LOP.TRGLOP = T_LOPTRUONG.TRGLOP
		INNER JOIN (SELECT * FROM dbo.F_GIAOVIEN (@p_malop)) AS T_GIAOVIEN ON T_GIAOVIEN.MALOP = LOP.MALOP
																		AND T_GIAOVIEN.MAGV = LOP.MAGVCN
		INNER JOIN HOCVIEN ON HOCVIEN.MALOP = LOP.MALOP 
GO

EXECUTE P_LOP 'K12'



 



--4. Tạo thủ tục P_TOPN liệt kê danh sách n môn học có số lượng học đăng ký học nhiều nhất.
-- Thông tin gồm: Mã môn học, tên môn học, số lượng học viên
-- Thủ tục nhận 1 tham số đầu vào là n.



-- sub so luong hoc vien
GO
CREATE OR ALTER FUNCTION F_SLHV ()
RETURNS TABLE
AS
RETURN(
	SELECT GIANGDAY.MAMH, SUM(LOP.SISO) AS SLHV
	FROM GIANGDAY INNER JOIN LOP ON LOP.MALOP = GIANGDAY.MALOP
	GROUP BY GIANGDAY.MAMH
)

GO


-- main
GO
CREATE OR ALTER PROC P_TOPN (@n int)
AS
SELECT TOP (@n) B1.MAMH,MONHOC.TENMH , B1.SLHV
FROM F_SLHV() B1 INNER JOIN MONHOC ON MONHOC.MAMH = B1.MAMH
WHERE SLHV >= ALL (
						 SELECT MAX(SLHV) FROM F_SLHV())
GO

EXECUTE P_TOPN 2



 




--5. Tạo thủ tục P_TK, thống kê số lượng học viên của từng môn học mà giáo viên (p_magv) đã phụ trách
--giảng dạy.
-- Thông tin gồm: MAGV, tên gv, mamh, tenmh, số lượng học viên
-- Thủ tục nhận 1 tham số đầu vào là mã giáo viên (p_magv).


GO 
CREATE OR ALTER PROC P_TK(@P_MAGV VARCHAR(10))
AS
SELECT GIANGDAY.MAGV,GIAOVIEN.HOTEN ,GIANGDAY.MAMH, MONHOC.TENMH ,SUM(LOP.SISO) AS SLHV
FROM GIANGDAY INNER JOIN LOP ON LOP.MALOP = GIANGDAY.MALOP
				INNER JOIN GIAOVIEN ON GIAOVIEN.MAGV = GIANGDAY.MAGV
				INNER JOIN MONHOC ON MONHOC.MAMH = GIANGDAY.MAMH
WHERE GIANGDAY.MAGV =@P_MAGV
GROUP BY GIANGDAY.MAGV,GIAOVIEN.HOTEN ,GIANGDAY.MAMH, MONHOC.TENMH

 
GO


EXECUTE P_TK 'GV15'
