USE QUAN_LY_SINH_VIEN

--DROP TABLE IF EXISTS KHOA
--CREATE  TABLE KHOA (
--	MAKHOA VARCHAR(10) PRIMARY KEY,
--	TENKHOA NVARCHAR(50),
--	NGTLAP DATE,
--	TRGKHOA VARCHAR(10)  FOREIGN KEY (TRGKHOA) REFERENCES GIAOVIEN(MAGV)
--)




 
--CREATE TABLE GIAOVIEN(
--	MAGV VARCHAR(10) PRIMARY KEY,
--	HOTEN NVARCHAR(50),
--	HOCVI NVARCHAR(50),
--	HOCHAM NVARCHAR(50),
--	GIOITINH BIT,
--	NGAYSINH DATE,
--	NGVAOLAM DATE,
--	HESO FLOAT(2),
--	MUCLUONG INT,
--	MAKHOA VARCHAR(10)
 
--	)

--ALTER TABLE GIAOVIEN
--	ADD CONSTRAINT FK_GIAOVIEN_KHOA FOREIGN KEY (MAKHOA) REFERENCES KHOA(MAKHOA)




--CREATE TABLE LOP(
--	MALOP VARCHAR(10) PRIMARY KEY,
--	TENLOP NVARCHAR(50),
--	TRGLOP NVARCHAR(50),
--	SISO INT,
--	MAGVCN VARCHAR(10)
--	FOREIGN KEY (MAGVCN) REFERENCES GIAOVIEN(MAGV)
--	)



--CREATE TABLE HOCVIEN(
--	MAHV VARCHAR(10) PRIMARY KEY,
--	HO NVARCHAR (50),
--	TEN NVARCHAR (50),
--	NGSINH DATE,
--	NOISINH NVARCHAR(50),
--	MALOP VARCHAR(10)
--	FOREIGN KEY (MALOP) REFERENCES LOP(MALOP)
--	)

ALTER TABLE LOP 
ADD CONSTRAINT FK_LOP_TRGLOP FOREIGN KEY (TRGLOP) REFERENCES HOCVIEN(MAHV)



--CREATE TABLE MONHOC (
--	MAMH VARCHAR(10) PRIMARY KEY,
--	TENMH NVARCHAR(50),
--	TCLT TINYINT,
--	TCTH TINYINT,
--	MAKHOA VARCHAR(10) FOREIGN KEY (MAKHOA) REFERENCES KHOA(MAKHOA)
		
----	)


--CREATE TABLE DIEUKIEN (
--	MAMH VARCHAR(10),
--	MAMH_TRUOC VARCHAR(10),
--	PRIMARY KEY (MAMH, MAMH_TRUOC),
--	FOREIGN KEY (MAMH ) REFERENCES MONHOC(MAMH),
--	FOREIGN KEY ( MAMH_TRUOC) REFERENCES MONHOC(MAMH)


--	)




--CREATE TABLE GIANGDAY (
--	MALOP VARCHAR(10) FOREIGN KEY (MALOP) REFERENCES LOP(MALOP),
--	MAMH VARCHAR(10) FOREIGN KEY (MAMH) REFERENCES MONHOC(MAMH),
--	MAGV VARCHAR(10) FOREIGN KEY (MAGV) REFERENCES GIAOVIEN(MAGV),
--	HOCKY TINYINT ,
--	NAM INT ,
--	TUNGAY DATE,
--	DENNGAY DATE,
--	PRIMARY KEY (MALOP, MAMH)
--	)



--CREATE TABLE KETQUATHI (
--	MAHV VARCHAR(10) FOREIGN KEY (MAHV) REFERENCES HOCVIEN(MAHV),
--	MAMH VARCHAR(10) FOREIGN KEY (MAMH) REFERENCES MONHOC(MAMH),
--	LANTHI TINYINT,
--	NGTHI DATE,
--	DIEM INT,
--	KQUA NVARCHAR(50),
--	PRIMARY KEY (MAHV, MAMH, LANTHI)

--)





















