USE QUAN_LY_DE_AN	

INSERT INTO DEAN(MaDA, TenDA, Kinhphi) VALUES
	('DA1', 'DE AN 1', 100),
	('DA2', 'DE AN 2', 210),
	('DA3', 'DE AN 3', 5500),
	('DA4', 'DE AN 4', 600),
	('DA5', 'DE AN 5', 210),
	('DA6', 'DE AN 7', 6300),
	('DA7', 'DE AN 8', 600),
	('DA8', 'DE AN 9', 812),
	('DA9', 'DE AN 10', 800);
	
	

INSERT INTO PHONGBAN (  MaPB,TenPB ,MaTP , DiaDiem ) VALUES 
	
	('PB2', 'KE TOAN', 'NV6', 'HCM'),
	('PB3', 'NHAN SU', 'NV11', 'HCM'),
	('PB4', 'KE HOACH', 'NV15', 'HCM');



INSERT INTO NHANVIEN( MaNV, TenNV, NgaySinh, GT, MaPB) VALUES 
	('NV1', 'NGUYEN VAN A', '2004-12-10', 0, 'PB1'),
	('NV2', 'NGUYEN VAN B', '2004-12-10', 0, 'PB1'),
	('NV3', 'NGUYEN VAN C', '2004-12-10', 0, 'PB1'),
	('NV4', 'NGUYEN VAN D', '2004-12-10', 0, 'PB1'),
	('NV5', 'NGUYEN VAN E', '2004-12-10', 0, 'PB1'),
	('NV6', 'NGUYEN VAN F', '2004-12-10', 0, 'PB1'),
	('NV7', 'NGUYEN VAN G', '2004-12-10', 0, 'PB1'),
	('NV8', 'NGUYEN VAN H', '2004-12-10', 0, 'PB1'),
	('NV9', 'NGUYEN VAN T', '2004-12-10', 0, 'PB1'),
	('NV10', 'NGUYEN VAN J', '2004-12-10', 0, 'PB1'),
	('NV11', 'NGUYEN VAN K', '2004-12-10', 0, 'PB1'),
	('NV12', 'NGUYEN VAN L', '2004-12-10', 0, 'PB1'),
	('NV13', 'NGUYEN VAN M', '2004-12-10', 0, 'PB1'),
	('NV14', 'NGUYEN VAN A', '2004-12-10', 0, 'PB1'),
	('NV15', 'NGUYEN VAN A', '2004-12-10', 0, 'PB1');
	


INSERT INTO THAMGIA(MaDA, MaNV, ChucVu, NgayBD) VALUES
	('DA1', 'NV1', 'CHUC VU 1', '2023-12-10'),
	('DA1', 'NV2', 'CHUC VU 2', '2023-02-12'),
	('DA1', 'NV3', 'CHUC VU 3', '2023-2-10'),
	('DA1', 'NV5', 'CHUC VU 5', '2023-12-10'),
	('DA1', 'NV4', 'CHUC VU 4', '2023-12-10'),
	
	('DA2', 'NV6', 'CHUC VU 6', '2023-12-10'),
	('DA2', 'NV7', 'CHUC VU 7', '2023-12-10'),
	('DA2', 'NV8', 'CHUC VU 8', '2023-12-10'),
	('DA2', 'NV9', 'CHUC VU 9', '2023-12-10'),
	('DA2', 'NV10', 'CHUC VU 10', '2023-12-10'),
	
	('DA3', 'NV11', 'CHUC VU 11', '2023-12-10'),
	('DA3', 'NV12', 'CHUC VU 12', '2023-12-10'),
	('DA3', 'NV13', 'CHUC VU 13', '2023-12-10'),
	('DA3', 'NV14', 'CHUC VU 14', '2023-12-10'),
	('DA3', 'NV15', 'CHUC VU 15', '2023-12-10');

