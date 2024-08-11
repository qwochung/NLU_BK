USE QUAN_LY_DE_AN


--Dùng câu lệnh SQL thực hiện các truy vấn sau:
--a. Cho biết số lượng nhân viên của từng phòng ban. Thông tin gồm: MaPB, TenPB, SLNV
SELECT PHONGBAN.MaPB, PHONGBAN.TenPB, COUNT(*) AS SLNV
FROM NHANVIEN JOIN PHONGBAN ON NHANVIEN.MaPB = PHONGBAN.MaPB
GROUP BY  PHONGBAN.MaPB, PHONGBAN.TenPB






--b. Cho biết số lượng nhân viên của từng đề án. Thông tin gồm: MaDA, TenDA, SLNV
SELECT DEAN.MaDA, DEAN.TenDA, COUNT(*) AS SLNV
FROM  (NHANVIEN JOIN THAMGIA ON NHANVIEN.MaNV = THAMGIA.MaNV ) JOIN DEAN ON DEAN.MaDA = THAMGIA.MaDA
GROUP BY  DEAN.MaDA, DEAN.TenDA




--c. Cho biết danh sách các trưởng phòng. Thông tin gồm: TenPB, Tên trưởng phòng
SELECT PHONGBAN.TenPB, NHANVIEN.TenNV
FROM NHANVIEN JOIN PHONGBAN ON NHANVIEN.MaNV = PHONGBAN.MaTP


