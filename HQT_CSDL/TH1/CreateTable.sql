--CREATE DATABASE QUAN_LY_DE_AN 
USE QUAN_LY_DE_AN; 


DROP TABLE IF EXISTS DEAN
CREATE TABLE DEAN(
	MaDA CHAR(10) PRIMARY KEY,
	TenDA NVARCHAR(100)  ,
	Kinhphi int 

)

DROP TABLE IF EXISTS PHONGBAN
CREATE TABLE PHONGBAN(
	MaPB CHAR(10) PRIMARY KEY,
	TenPB NVARCHAR (100),
	MaTP CHAR(10), 
	DiaDiem nvarchar (100)
)

DROP TABLE IF EXISTS NHANVIEN, PHONGBAN
CREATE TABLE NHANVIEN (
	MaNV char(10) PRIMARY KEY,
	TenNV NVARCHAR (100),
	NgaySinh DATE,	
	GT BIT ,
	MaPB CHAR (10),
	FOREIGN KEY (MaPB) REFERENCES PHONGBAN (MaPB)
)

ALTER TABLE PHONGBAN
	DROP CONSTRAINT FK_PHONGBAN_NHANVIEN;
	--ADD CONSTRAINT  FK_PHONGBAN_NHANVIEN FOREIGN KEY (MaTP) REFERENCES NHANVIEN(MaNV) 


DROP TABLE IF EXISTS THAMGIA
CREATE TABLE THAMGIA (
	MaNV CHAR(10),
	MaDA CHAR (10),
	NgayBD DATE,
	ChucVu NVARCHAR (100)
	PRIMARY KEY ( MaNV, MaDA) 

)