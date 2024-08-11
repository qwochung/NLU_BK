USE QUAN_LY_SINH_VIEN

--INSERT INTO KHOA(MAKHOA, TENKHOA, NGTLAP) VALUES 
--	('MTT', 'Mang Va Truyen Thong', '2005-10-20'), 
--	('HTTT', 'He Thong Thong Tin', '2005-06-7'), 
--	('CNPM', 'Cong Nghe Phan Mem', '2005-06-7'), 
--	('KTMT', 'Ky Thuat May Tinh', '2005-12-20')

	

--INSERT INTO GIAOVIEN(MAGV, HOTEN, HOCVI, HOCHAM, GIOITINH, NGAYSINH, NGVAOLAM,HESO, MUCLUONG, MAKHOA) VALUES 
--	('GV01', 'Ho Thanh Son', 'PGS', 'GS',0, '1950-05-02', '2004-01-11', 5.00, 2250000, 'KHMT'),
--	('GV02', 'Tran Tam Thanh', 'TS', 'PGS',0, '1965-12-17', '2004-04-20', 4.50, 2050000, 'HTTT'),
--	('GV03', 'Do Nghiem Phung', 'TS', 'GS',0, '1950-08-01', '2004-09-23', 4.00, 1800000, 'CNPM'),
--	('GV04', 'Tran Nam Son', 'TS', 'PGS',0, '1961-02-22', '2005-01-12', 4.50, 2050000, 'KTMT'),
--	('GV05', 'Mai Thanh Danh', 'ThS', 'GV',0, '1958-03-12', '2005-01-12', 3.00, 1350000, 'HTTT'),
--	('GV06', 'Tran Doan Hung', 'TS', 'GV',0, '1953-03-11', '2005-01-12', 4.50, 2050000, 'KHMT'),
--	('GV07', 'NGUYEN MINH TIEN', 'ThS', 'GV',0, '1971-11-23', '2005-03-01', 4.00, 1800000, 'KHMT'),
--	('GV08', 'Le Thi Tran', 'KS', NULL,1, '1974-03-26', '2005-03-01', 1.69, 760000, 'KHMT'),
--	('GV09', 'Ngyen To Lan', 'ThS', 'GV',1, '1974-12-23', '2005-03-01', 1.86, 837000, 'CNPM'),
--	('GV10', 'Ho Thanh Tung', 'CN', 'GV',0, '1973-11-23', '2005-03-01', 2.67, 1200000, 'MTT'),
--	('GV11', 'Le Tran Anh Loan', 'KS', NULL,1, '1983-10-12', '2005-05-15',  1.86, 837000, 'CNPM'),
--	('GV12', 'Tran Van Anh', 'CN', NULL,1, '1981-04-23', '2005-05-15', 2.67, 1200000,'KTMT'),
--	('GV13', 'Le Anh Nuoi', 'TS', 'PSG',0, '1961-02-04', '2005-05-15', 4.00, 1800000,'KTMT'),
--	('GV14', 'Tran Phuc Khoa', 'ThS', 'GV',0, '1991-02-23', '2005-05-15',3.00, 1350000, 'MTT'),
--	('GV15', 'Nguyen Bao Thien Y', 'TS', 'PSG',1, '1961-12-04', '2005-05-15', 4.00, 1800000,'KTMT')


--UPDATE KHOA
--SET TRGKHOA = 'GV04'
--WHERE MAKHOA='MTT'


--INSERT INTO MONHOC(MAMH, TENMH, TCLT, TCTH, MAKHOA) VALUES
--	('THDC', 'Tin Hoc Dai Cuong', 4, 1, 'KTMT'),
--	('CTRR', 'Cau truc roi rac', 5, 0, 'KTMT'),
--	('CSDL', 'Co so du lieu', 3, 1, 'HTTT'),
--	('CTDLGT', 'Cau truc du lieu va giai thuat', 3, 1, 'KHMT'),
--	('PTTKTT', 'Phan tich thiet ke thuat toan', 3, 0, 'KHMT'),
--	('DHMT', 'Do hoa may tinh', 3, 1, 'KHMT'),
--	('KTMT', 'Kien truc may tinh', 3, 0, 'KTMT'),
--	('THCSDL', 'Thiet ke Co so du lieu' , 3, 1, 'HTTT'),
--	('PTTKHTTT', 'Phan tich thiet ke he thong thong tin' , 4, 1, 'HTTT'),
--	('HDH', 'He dieu hanh' , 4, 0, 'KTMT'),
--	('NMCNPM', 'Nhap mon cong nghe phan mem' , 3, 0, 'CNPM'),
--	('LTCFW', 'Lap trinh C for Win' , 3, 1, 'CNPM'),
--	('LTHDT', 'Lap trinh huong doi tuong' , 3, 1, 'CNPM');



--INSERT INTO LOP (MALOP, TENLOP, TRGLOP, SISO, MAGVCN) VALUES 
--	('K11', 'Lop 1 Khoa 1', NULL, 11, 'GV07'),
--	('K12', 'Lop 2 Khoa 1', NULL, 12, 'GV09'),
--	('K13', 'Lop 3 Khoa 1', NULL, 12, 'GV14')




--INSERT INTO HOCVIEN (MAHV, HO, TEN, NGSINH, NOISINH,  MALOP) VALUES
--	('K1101', 'Tran', 'Duc Bo', '1986-02-12', 'Ben Tre', 'K11'),
--	('K1102', 'Nguyen', 'Bao Lam', '1986-03-22', 'HCM', 'K11'),
--	('K1103', 'Dao', 'Duc Duy', '1986-04-02', 'Vung Tau', 'K11'),
--	('K1104', 'Le', 'Kim Lien', '1986-03-05', 'Khanh Hoa', 'K11'),
--	('K1105', 'Tang', 'Nhon Phu', '1986-12-22', 'Lam Dong', 'K11'),
--	('K1106', 'Nguyen', 'Hoai Bao', '1986-02-02', 'Kien Giang', 'K11'),
--	('K1107', 'Le', 'Duc Chi', '1986-09-19', 'Ca Mau', 'K11'),
--	('K1108', 'Doan', 'Thi Diem', '1986-12-12', 'Can Tho', 'K11'),
--	('K1109', 'Tran', 'Quoc Tuan', '1986-11-03', 'Ca Mau', 'K11'),
--	('K1110', 'Tran', 'Xuan Hau', '1986-12-12', 'Ben Tre', 'K11'),


--	('K1201', 'Nguyen', 'Duc Tri', '1986-06-15', 'Ben Tre', 'K12'),
--	('K1202', 'Dao', 'Canh Moc', '1986-08-13', 'Ben Tre', 'K12'),
--	('K1203', 'Cao', 'Duc Duy', '1986-01-01', 'Ben Tre', 'K12'),
--	('K1204', 'Le', 'Thanh Xuan', '1986-02-05', 'Ben Tre', 'K12'),
--	('K1205', 'Nguyen', 'Ba Quat', '1986-12-20', 'Ben Tre', 'K12'),
--	('K1206', 'Tran', 'Thanh Binh', '1986-12-15', 'Ben Tre', 'K12'),
--	('K1207', 'Dao', 'Duy Khanh', '1986-02-17', 'Ben Tre', 'K12'),
--	('K1208', 'Do', 'Hoai Bao', '1986-02-21', 'Ben Tre', 'K12'),
--	('K1209', 'Tran', 'Thanh Dieu', '1986-12-12', 'Ben Tre', 'K12'),
--	('K1210', 'Phung', 'Tri Duc', '1986-02-12', 'Ben Tre', 'K12'),


--	('K1301', 'Ha', 'Thanh Nhan', '1986-12-16', 'Ben Tre', 'K13'),
--	('K1302', 'Thien', 'Van Hoc', '1986-05-18', 'Ben Tre', 'K13'),
--	('K1303', 'Cao', 'Nguyen Manh', '1986-08-19', 'Ben Tre', 'K13'),
--	('K1304', 'Do', 'Thanh Phong', '1986-09-20', 'Ben Tre', 'K13'),
--	('K1305', 'Tran', 'Thanh Tri', '1986-10-21', 'Ben Tre', 'K13'),
--	('K1306', 'Le', 'Van Luyen', '1986-12-22', 'Ben Tre', 'K13'),
--	('K1307', 'Nguyen', 'Bao Khang', '1986-01-23', 'Ben Tre', 'K13'),
--	('K1308', 'Cao', 'Minh Khooi', '1986-11-24', 'Ben Tre', 'K13'),
--	('K1309', 'Ho', 'Qui Ly', '1986-07-25', 'Ben Tre', 'K13'),
--	('K1310', 'Phung', 'Duc Toan', '1986-09-26', 'Ben Tre', 'K13');


--UPDATE  LOP
--SET TRGLOP = 'K1301'
--WHERE MALOP='K133'


--INSERT INTO GIANGDAY(MALOP, MAMH, MAGV, HOCKY, NAM, TUNGAY,DENNGAY) VALUES
--	('K11', 'THDC', 'GV07', 1, 2006,'2006-01-02', '2006-05-12'),
--	('K12', 'THDC', 'GV06', 1, 2006,'2006-01-02', '2006-05-12'),
--	('K13', 'THDC', 'GV15', 1, 2006,'2006-01-02', '2006-05-12'),

--	('K11', 'CTRR', 'GV02', 1, 2006,'2006-01-09', '2006-05-17'),
--	('K12', 'CTRR', 'GV02', 1, 2006,'2006-01-09', '2006-05-17'),
--	('K13', 'CTRR', 'GV08', 1, 2006,'2006-01-09', '2006-05-17'),
	
--	('K11', 'CSDL', 'GV05', 2, 2006,'2006-06-01', '2006-07-15'),
--	('K12', 'CSDL', 'GV09', 2, 2006,'2006-06-01', '2006-07-15'),
--	('K13', 'CSDL', 'GV05', 3, 2006,'2006-08-01', '2006-12-15'),

--	('K11', 'CTDLGT', 'GV15', 2, 2006,'2006-06-01', '2006-07-15'),
--	('K12', 'CTDLGT', 'GV15', 3, 2006,'2006-08-01', '2006-12-15'),
--	('K13', 'CTDLGT', 'GV15', 3, 2006,'2006-08-01', '2006-12-15'),


--	('K13', 'DHMT', 'GV07', 3, 2006,'2006-08-01', '2006-12-15'),
--	('K11', 'DHMT', 'GV15', 1, 2007,'2006-02-18', '2006-03-20'),

--	('K11', 'HDH', 'GV04', 1, 2007,'2006-02-18', '2006-03-20'),
--	('K12', 'HDH', 'GV04', 1, 2007,'2006-02-18', '2006-03-20');




--INSERT INTO DIEUKIEN(MAMH, MAMH_TRUOC) VALUES 
--	('CSDL', 'CTRR'),
--	('CSDL', 'CTDLGT'),
--	('CTDLGT', 'THDC'),
--	('PTTKTT', 'THDC'),
--	('PTTKTT', 'CTDLGT'),
--	('DHMT', 'THDC'),
--	('LTHDT', 'THDC'),
--	('PTTKHTTT', 'CSDL')



--INSERT INTO KETQUATHI(MAHV, MAMH, LANTHI,NGTHI ,DIEM, KQUA) VALUES
--	('K1101', 'CSDL', 1, '2006-07-20', 10.00, 'DAT'),
--	('K1101', 'CTDLGT', 1, '2006-12-20', 9.00, 'DAT'),
--	('K1101', 'THDC', 1, '2006-05-20', 9.00, 'DAT'),
--	('K1101', 'CTRR', 1, '2006-05-20', 9.50, 'DAT'),
	
--	('K1102', 'CSDL', 1, '2006-07-20', 3.00, 'KO'),
--	('K1102', 'CSDL', 2, '2006-07-25', 2.00, 'KO'),
--	('K1102', 'CSDL', 3, '2006-08-20', 5.00, 'DAT'),

--	('K1102', 'CTDLGT', 1, '2006-12-20', 10.00, 'DAT'),
--	('K1102', 'CTDLGT', 2, '2007-01-20', 10.00, 'DAT'),
--	('K1102', 'CTDLGT', 3, '2007-01-30', 10.00, 'DAT'),

--	('K1102', 'THDC', 1, '2006-07-20', 10.00, 'DAT'),



	INSERT INTO KETQUATHI (MAHV, MAMH, LANTHI, NGTHI, DIEM, KQUA) VALUES
('K1101', 'CSDL', 1, '2006-07-20', 10.00, 'Dat'),
('K1101', 'CTDLGT', 1, '2006-12-28', 9.00, 'Dat'),
('K1101', 'THDC', 1, '2006-05-20', 9.00, 'Dat'),
('K1101', 'CTRR', 1, '2006-05-13', 9.00, 'Dat'),
('K1102', 'CSDL', 1, '2006-05-20', 4.25, 'Khong Dat'),
('K1102', 'CSDL', 2, '2006-07-27', 4.25, 'Khong Dat'),
('K1102', 'CSDL', 3, '2006-12-28', 4.50, 'Khong Dat'),
('K1102', 'CTDLGT', 1, '2006-12-28', 4.50, 'Khong Dat'),
('K1102', 'THDC', 1, '2006-05-05', 4.00, 'Khong Dat'),
('K1102', 'CTRR', 1, '2006-05-13', 7.00, 'Dat'),
('K1103', 'CSDL', 1, '2006-07-20', 8.25, 'Dat'),
('K1103', 'CTDLGT', 1, '2006-12-28', 7.00, 'Dat'),
('K1103', 'THDC', 1, '2006-05-20', 5.00, 'Dat'),
('K1103', 'CTRR', 1, '2006-05-13', 6.50, 'Dat'),
('K1104', 'CSDL', 1, '2006-07-20', 3.75, 'Khong Dat'),
('K1104', 'CTDLGT', 1, '2006-12-28', 4.00, 'Khong Dat'),
('K1104', 'CTRR', 1, '2006-05-13', 4.00, 'Khong Dat'),
('K1104', 'THDC', 1, '2006-05-05', 5.00, 'Dat'),
('K1104', 'CTRR', 2, '2006-06-30', 5.50, 'Khong Dat'),
('K1201', 'CSDL', 1, '2006-07-20', 6.00, 'Dat'),
('K1201', 'CTDLGT', 1, '2006-12-28', 8.00, 'Dat'),
('K1201', 'CTRR', 1, '2006-05-13', 9.00, 'Dat'),
('K1201', 'THDC', 1, '2006-05-20', 5.00, 'Dat'),
('K1202', 'CTDLGT', 1, '2006-12-28', 5.00, 'Khong Dat'),
('K1202', 'CTDLGT', 2, '2006-01-05', 5.00, 'Khong Dat'),
('K1202', 'THDC', 1, '2006-05-20', 4.00, 'Khong Dat'),
('K1202', 'CTRR', 1, '2006-05-13', 3.00, 'Khong Dat'),
('K1203', 'CSDL', 1, '2006-07-20', 9.25, 'Dat'),
('K1203', 'CTDLGT', 1, '2006-12-28', 6.25, 'Dat'),
('K1203', 'THDC', 1, '2006-05-20', 10.00, 'Dat'),
('K1203', 'CTRR', 1, '2006-05-13', 10.00, 'Dat'),
('K1204', 'CSDL', 1, '2006-07-20', 8.00, 'Dat'),
('K1204', 'CTDLGT', 1, '2006-12-28', 6.75, 'Dat'),
('K1204', 'THDC', 1, '2006-05-20', 4.00, 'Khong Dat'),
('K1204', 'CTRR', 1, '2006-05-13', 6.00, 'Dat'),
('K1301', 'CSDL', 1, '2006-12-20', 4.25, 'Khong Dat'),
('K1301', 'CTDLGT', 1, '2006-07-25', 8.00, 'Dat'),
('K1301', 'THDC', 1, '2006-05-20', 7.75, 'Dat'),
('K1301', 'CTRR', 1, '2006-05-13', 8.00, 'Dat'),
('K1302', 'CSDL', 1, '2006-12-20', 6.75, 'Dat'),
('K1302', 'CTDLGT', 1, '2006-07-25', 5.00, 'Dat'),
('K1302', 'THDC', 1, '2006-05-20', 5.00, 'Dat'),
('K1302', 'CTRR', 1, '2006-05-13', 8.50, 'Dat'),
('K1303', 'CSDL', 1, '2006-12-20', 4.00, 'Khong Dat'),
('K1303', 'CTDLGT', 1, '2006-07-25', 4.50, 'Khong Dat'),
('K1303', 'CTDLGT', 2, '2006-08-07', 4.00, 'Khong Dat'),
('K1303', 'THDC', 1, '2006-05-20', 4.50, 'Khong Dat'),
('K1303', 'CTRR', 1, '2006-05-13', 3.25, 'Khong Dat'),
('K1303', 'CTRR', 2, '2006-05-20', 5.00, 'Dat'),
('K1304', 'CSDL', 1, '2006-12-20', 7.75, 'Dat'),
('K1304', 'CTDLGT', 1, '2006-07-25', 9.75, 'Dat'),
('K1304', 'THDC', 1, '2006-05-20', 5.50, 'Dat'),
('K1304', 'CTRR', 1, '2006-05-13', 6.00, 'Dat'),
('K1305', 'CSDL', 1, '2006-12-20', 9.25, 'Dat'),
('K1305', 'CTDLGT', 1, '2006-07-25', 6.75, 'Dat'),
('K1305', 'THDC', 1, '2006-05-20', 8.00, 'Dat'),
('K1305', 'CTRR', 1, '2006-05-13', 10.00, 'Dat');


