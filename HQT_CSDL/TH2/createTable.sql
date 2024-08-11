CREATE DATABASE PHAN_PHO_NUOC_GIAI_KHAT

ALTER DATABASE NewDatabaseName
MODIFY NAME = PHAN_PHOI_NUOC_GIAI_KHAT;
USE PHAN_PHOI_NUOC_GIAI_KHAT


CREATE TABLE NHACC (
	MaNCC VARCHAR(10) PRIMARY KEY ,
	TenNCC NVARCHAR (50),
	DiaChiNCC NVARCHAR (50),
	DTNCC VARCHAR(10)
)



DROP TABLE IF EXISTS LOAINGK;
CREATE TABLE LOAINGK (
	MaLoaiNGK VARCHAR(10) PRIMARY KEY ,
	TenLoaiNGK NVARCHAR (50),
	MaNCC VARCHAR(10) ,
	FOREIGN KEY (MaNCC) REFERENCES NHACC(MaNCC)
)



DROP TABLE IF EXISTS NGK;
CREATE TABLE NGK (
	MaNGK VARCHAR(10) PRIMARY KEY ,
	TenNGK NVARCHAR (50),
	QuyCach NVARCHAR (50),
	MaLoaiNGK VARCHAR(10),
	FOREIGN KEY (MaLoaiNGK) REFERENCES LOAINGK(MaLoaiNGK)
)





CREATE TABLE KH (
	MaKH VARCHAR(10) PRIMARY KEY ,
	TenKH NVARCHAR (50),
	DCKH NVARCHAR (50),
	DTKH VARCHAR(10)
)


DROP TABLE IF EXISTS DDH;
CREATE TABLE DDH (
	SoDDH VARCHAR(10) PRIMARY KEY ,
	NgayDH DATE,
	MaNCC VARCHAR(10)
	FOREIGN KEY (MaNCC) REFERENCES NHACC(MaNCC)

)


DROP TABLE IF EXISTS CT_DDH;
CREATE TABLE CT_DDH (
	SoDDH VARCHAR(10) ,
	MaNGK VARCHAR(10),
	SLDat INT,
	PRIMARY KEY ( SoDDH, MaNGK),
	FOREIGN KEY (SoDDH) REFERENCES DDH(SoDDH),
	FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)
)

CREATE TABLE PHIEUGHI (
	SoPGH VARCHAR(10) PRIMARY KEY ,
	NgayDH DATE,
	SoDDH VARCHAR(10)
	FOREIGN KEY (SoDDH) REFERENCES DDH(SoDDH)

)

CREATE TABLE CT_PGH (
	SoPGH VARCHAR(10)  ,
	MaNGK VARCHAR(10),
	SLGiao INT,
	DGGiao INT,
	PRIMARY KEY (SoPGH, MaNGK),
	FOREIGN KEY (SoPGH) REFERENCES PHIEUGHI(SoPGH),
	FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)

)

CREATE TABLE HOADON (
	SoHD VARCHAR(10) PRIMARY KEY ,
	NgaylapHD DATE,
	MaKH VARCHAR(10)
	FOREIGN KEY (MaKH) REFERENCES KH(MaKH)

)

CREATE TABLE CT_HOADON (
	SoHD VARCHAR(10) ,
	MaNGK VARCHAR(10),
	SLKHMua INT,
	DGBan INT,
	PRIMARY KEY (SoHD, MaNGK),
	FOREIGN KEY (SoHD) REFERENCES HOADON(SoHD),
	FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)

)


CREATE TABLE PHIEUHEN (
	SoPH VARCHAR(10) PRIMARY KEY ,
	NgaylapPH DATE,
	NgayHenGiao DATE,
	MaKH VARCHAR(10)
	FOREIGN KEY (MaKH) REFERENCES KH(MaKH)

)


CREATE TABLE CT_PH (
	SoPH VARCHAR(10)  ,
	MaNGK VARCHAR(10),
	SLHen INT,
	PRIMARY KEY (SoPH, MaNGK),
	FOREIGN KEY (SoPH) REFERENCES PHIEUHEN(SoPH),
	FOREIGN KEY (MaNGK) REFERENCES NGK(MaNGK)

)


CREATE TABLE PHIEUTRANO (
	SoPTN VARCHAR(10) PRIMARY KEY ,
	NgayTra DATE,
	SoTienTra INT ,
	SoHD VARCHAR(10)
	FOREIGN KEY (SoHD) REFERENCES HOADON(SoHD)

)