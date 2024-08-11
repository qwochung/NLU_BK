USE PHAN_PHOI_NUOC_GIAI_KHAT

INSERT INTO NHACC( MaNCC, TenNCC, DiaChiNCC, DTNCC) VALUES 
	('NC1', 'COCACOLA Company', 'Linh Trung, Thu Duc', '01111111'),
	('NC2', 'PEPSI Company', 'Chuong Duong, Quan 1', '022222222'),
	('NC3', 'ChuongDuong Company', 'Ham Tu, Quan 5', '03333333');


INSERT INTO LOAINGK ( MaLoaiNGK, TenLoaiNGK, MaNCC) VALUES 
	('NK1', 'Nuoc ngot co gas', 'NC1'),
	('NK2', 'Nuoc ngot khong gas', 'NC2'),
	('NK3', 'Tra', 'NC1'),
	('NK4', 'Sua', 'NC2');




INSERT INTO NGK (MaNGK, TenNGK, QuyCach, MaLoaiNGK) VALUES 
	('CC1', 'Coca Cola', 'Chai', 'NK1'),
	('CC2', 'Coca Cola', 'Lon', 'NK1'),
	('PS1', 'Pepsi', 'Chai', 'NK1'),
	('PS2', 'Pepsi', 'Lon', 'NK1'),
	('SV1', 'Seven Up', 'Chai', 'NK1'),
	('SV2', 'Seven Up', 'Lon', 'NK1'),
	('NO1', 'Number One', 'Chai', 'NK1'),
	('NO2', 'Number One', 'Lon', 'NK1'),
	('ST1', 'Sting', 'Chai', 'NK1'),
	('ST2', 'Sting', 'Lon', 'NK1'),
	('C2', 'Tra C2', 'Chai', 'NK2'),
	('OD', 'Tra Xanh 0 Do', 'Chai', 'NK2'),
	('ML1', 'Sua Tuoi Tiet Trung', 'Bich', 'NK1'),
	('WT1', 'Nuoc Uong Dong Chai', 'Chai', 'NK2');
	



INSERT INTO KH(MaKH, TenKH, DCKH, DTKH) VALUES 
	('KH01', 'Cua Hang BT', '144 XVNT', '0999999'),
	('KH02', 'Cua Hang Tra', '198/42 NTT', '088888'),
	('KH03', 'Sieu Thi Coop', '24 DTH', '0777777');




INSERT INTO DDH(SoDDH, NgayDH, MaNCC) VALUES 
	('DDH01', '2011-05-10', 'NC1'),
	('DDH02', '2011-05-20', 'NC1'),
	('DDH03', '2011-05-26', 'NC1'),
	('DDH04', '2011-06-03', 'NC1');




INSERT INTO CT_DDH(SoDDH, MaNGK, SLDat) VALUES 
	('DDH01', 'CC1', 20),
	('DDH01', 'CC2', 15),
	('DDH01', 'PS1', 18),
	('DDH01', 'SV2', 12),
	('DDH02', 'CC2', 30),
	('DDH02', 'PS2', 10),
	('DDH02', 'SV1', 5),
	('DDH02', 'ST1', 15),
	('DDH02', 'C2', 10),
	('DDH03', 'OD', 45),
	('DDH04', 'CC1', 8),
	('DDH04', 'ST2', 12);
	


INSERT INTO PHIEUGHI(SoPGH, NgayDH, SoDDH) VALUES 
	('PGH01', '2010-05-12','DDH01'),
	('PGH02', '2010-05-15','DDH01'),
	('PGH03', '2010-05-21','DDH02'),
	('PGH04', '2010-05-22','DDH02'),
	('PGH05', '2010-05-28','DDH03');



INSERT INTO CT_PGH(SoPGH, MaNGK, SLGiao, DGGiao) VALUES 
	('PGH01', 'CC1', 15, 5000),
	('PGH01', 'CC2', 15, 4000),
	('PGH01', 'SV2', 10, 4000),
	('PGH02', 'SV2', 2, 4000),
	('PGH03', 'CC2', 30, 5000),
	('PGH03', 'PS2', 10, 4000),
	('PGH03', 'ST1', 15, 9000),
	('PGH03', 'C2', 10, 8000);



INSERT INTO HOADON(SoHD, NgaylapHD, MaKH) VALUES 
	('HD01', '2010-05-10', 'KH01'),
	('HD02', '2010-05-20', 'KH01'),
	('HD03', '2010-06-05', 'KH02'),
	('HD04', '2010-06-16', 'KH02'),
	('HD05', '2010-06-22', 'KH02'),
	('HD06', '2010-07-08', 'KH03');





INSERT INTO CT_HOADON(SoHD, MaNGK, SLKHMua, DGBan) VALUES
	('HD01', 'CC1', 20, 6000),
	('HD01', 'CC2', 50, 5000),
	('HD02', 'ST1', 40, 10000),
	('HD03', 'SV2', 60, 5000),
	('HD04', 'PS2', 25, 5000), 
	('HD05', 'CC1', 100, 6000), 
	('HD05', 'SV1', 12, 8000), 
	('HD05', 'C2', 80, 9000), 
	('HD06', 'OD', 55, 1000), 
	('HD06', 'ST2', 50, 11000);

	



INSERT INTO PHIEUHEN(SoPH, NgaylapPH, NgayHenGiao, MaKH) VALUES 
	('PH01', '2010-05-08', '2010-06-09', 'KH01'),
	('PH02', '2010-05-25', '2010-06-28', 'KH02'),
	('PH03', '2010-06-01', '2010-06-02', 'KH03');




INSERT INTO CT_PH(SoPH, MaNGK, SLHen) VALUES
	('PH01', 'ST2', 10),
	('PH01', 'OD', 8),
	('PH02', 'CC1', 20),
	('PH03', 'ST1', 7),
	('PH03', 'SV2', 12),
	('PH03', 'CC2', 9),
	('PH04', 'PS2', 15);






INSERT INTO PHIEUTRANO(SoPTN, NgayTra, SoTienTra, SoHD) VALUES
	('PTN01', '2010-05-18', 500000, 'HD01'),
	('PTN02', '2010-06-01', 350000, 'HD01'),
	('PTN03', '2010-06-02', 650000, 'HD02'),
	('PTN04', '2010-06-15', 1020000, 'HD03'),
	('PTN05', '2010-07-01', 1080000, 'HD03');