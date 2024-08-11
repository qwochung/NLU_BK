﻿USE PHAN_PHOI_NUOC_GIAI_KHAT

----1 Liệt kê các NGK và loại NGK tương ứng.
--SELECT *
--FROM NGK INNER JOIN LOAINGK ON NGK.MaLoaiNGK= LOAINGK.MaLoaiNGK


----2 Cho biết thông tin về nhà cung cấp ở Thành phố HCM.
--SELECT *
--FROM NHACC
--WHERE NHACC.DiaChiNCC LIKE '%Thu%Duc%'



---- 3 Liệt kê các hóa đơn mua hàng trong tháng 5/2010.
--SELECT * 
--FROM HOADON
--WHERE MONTH(HOADON.NgaylapHD) =5
--	AND YEAR(HOADON.NgaylapHD) = 2010




---- 4 Cho biết tên các nhà cung cấp có cung cấp NGK ‘Coca Cola’
--SELECT NHACC.TenNCC
--FROM ( NHACC INNER JOIN LOAINGK ON NHACC.MaNCC = LOAINGK.MaNCC ) INNER JOIN NGK ON NGK.MaLoaiNGK = LOAINGK.MaLoaiNGK
--WHERE NGK.TenNGK LIKE '%Coca%Cola%'



----5) Cho biết tên các nhà cung cấp có thể cung cấp nhiều loại NGK nhất.
--SELECT NHACC.TenNCC, COUNT(*) AS SL
--FROM NHACC INNER JOIN LOAINGK ON NHACC.MaNCC = LOAINGK.MaNCC
--GROUP BY NHACC.TenNCC
--HAVING COUNT(*) >= ALL (
--					SELECT COUNT(*)
--					FROM NHACC INNER JOIN LOAINGK ON NHACC.MaNCC = LOAINGK.MaNCC
--					GROUP BY NHACC.TenNCC
--				)


----6) Cho biết tên nhà cung cấp không có khả năng cung cấp NGK có tên ‘Pepsi’.

--SELECT NHACC.TenNCC, NGK.TenNGK
--FROM (NHACC INNER JOIN LOAINGK ON NHACC.MaNCC = LOAINGK.MaNCC) INNER JOIN NGK ON NGK.MaLoaiNGK = LOAINGK.MaLoaiNGK
--WHERE NHACC.TenNCC NOT IN (
--						SELECT NHACC.TenNCC
--						FROM (NHACC INNER JOIN LOAINGK ON NHACC.MaNCC = LOAINGK.MaNCC) INNER JOIN NGK ON NGK.MaLoaiNGK = LOAINGK.MaLoaiNGK
--						WHERE NGK.TenNGK LIKE '%Pepsi%'
						
--					)





----7) Hiển thị thông tin của NGK chưa bán được.

--SELECT NGK.TenNGK, NGK.MaLoaiNGK, NGK.MaNGK, NGK.QuyCach
--FROM NGK
--WHERE NGK.TenNGK NOT IN (
--					SELECT NGK.TenNGK
--					FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD =CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK =CT_HOADON.MaNGK
--				)






--8) Hiển thị tên và tổng số lượng bán của từng NGK.

--SELECT NGK.TenNGK, SUM(CT_HOADON.SLKHMua)
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--GROUP BY NGK.TenNGK, NGK.MaNGK





----9) Hiển thị tên và tổng số lượng của NGK nhập về.
--SELECT NGK.TenNGK, SUM(CT_DDH.SLDat)
--FROM (DDH INNER JOIN CT_DDH ON DDH.SoDDH = CT_DDH.SoDDH)INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK
--GROUP BY NGK.TenNGK, NGK.MaNGK





--10) Hiển thị ĐĐH đã đặt NGK với số lượng nhiều nhất so với các ĐĐH khác có đặt NGK đó. Thông tin hiển thị: SoDDH, MaNGK, [SL đặt nhiều nhất].
SELECT CT_DDH.SoDDH, CT_DDH.MaNGK, CT_DDH.SLDat
FROM CT_DDH INNER JOIN (SELECT CT_DDH.MaNGK,  MAX(CT_DDH.SLDat) AS MAXSLDAT
							FROM CT_DDH
							GROUP BY CT_DDH.MaNGK) AS MAXSL ON 
								CT_DDH.SLDat = MAXSL.MAXSLDAT
								AND CT_DDH.MaNGK = MAXSL.MaNGK








----11) Hiển thị các NGK không được nhập trong tháng 1/2010.
--SELECT NGK.TenNGK,NGK.MaNGK, NGK.MaLoaiNGK, NGK.QuyCach
--FROM NGK
--WHERE NGK.MaNGK NOT IN (
--					SELECT NGK.MaNGK
--					FROM (DDH INNER JOIN CT_DDH ON DDH.SoDDH = CT_DDH.SoDDH)INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK
--					WHERE MONTH(DDH.NgayDH) = 1
--							AND YEAR (DDH.NgayDH) = 2010

--				)





--12) Hiển thị tên các NGK không bán được trong tháng 6/2010.

--SELECT NGK.TenNGK,NGK.MaNGK, NGK.MaLoaiNGK, NGK.QuyCach, HOADON.NgaylapHD
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE NGK.MaNGK NOT IN (
--					SELECT NGK.MaNGK 
--					FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--					WHERE MONTH(HOADON.NgaylapHD) = 6
--							AND YEAR (HOADON.NgaylapHD) = 2010

--				)

  



--13) Cho biết cửa hàng bán bao nhiêu thứ NGK.
--SELECT COUNT(*) AS SOLUONG
--FROM  (DDH INNER JOIN CT_DDH ON DDH.SoDDH = CT_DDH.SoDDH)INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK





----14) Cho biết cửa hàng bán bao nhiêu loại NGK.
--SELECT COUNT(*) AS SOLOAI
--FROM  ( SELECT MaLoaiNGK
--		FROM  (DDH INNER JOIN CT_DDH ON DDH.SoDDH = CT_DDH.SoDDH)INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK
--		GROUP BY MaLoaiNGK) AS N
 



----15) Hiển thị thông tin của khách hàng có giao dịch với cửa hàng nhiều nhất (căn cứ vào số lần mua hàng).
--SELECT KH.TenKH, COUNT(*) AS SOLANMUA
--FROM (KH INNER JOIN HOADON ON KH.MaKH = HOADON.MaKH)
--GROUP BY KH.TenKH
--HAVING COUNT(*) >= ALL (
--					SELECT COUNT(*)
--					FROM HOADON
--					GROUP BY HOADON.MaKH
--					)
		






--16) Tính tổng doanh thu năm 2010 của cửa hàng.
--SELECT SUM( SLKHMua*DGBan) AS TONGDOANHTHU
--FROM HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD
--WHERE YEAR(HOADON.NgaylapHD) = 2010







----17) Liệt kê 5 loại NGK bán chạy nhất (doanh thu) trong tháng 5/2010.
--SELECT TOP (5) NGK.TenNGK, CT_HOADON.SLKHMua*CT_HOADON.DGBan AS DOANHTHU
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD) INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE YEAR(HOADON.NgaylapHD)= 2010
--	AND MONTH(HOADON.NgaylapHD) = 5
--ORDER BY DOANHTHU DESC



----18) Liệt kê thông tin bán NGK của tháng 5/2010. Thông tin hiển thị: Mã NGK, Tên NGK, SL bán.
--SELECT NGK.TenNGK, SUM(CT_HOADON.SLKHMua) AS SLBAN
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE  YEAR(HOADON.NgaylapHD)= 2010
--		AND MONTH(HOADON.NgaylapHD) = 5
--GROUP BY NGK.TenNGK, NGK.MaNGK



--19) Liệt kê thông tin của NGK có nhiều người mua nhất.
--SELECT NGK.TenNGK, NGK.MaNGK, NGK.QuyCach
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE CT_HOADON.SLKHMua >= ALL (
--							SELECT SLKHMua
--							FROM CT_HOADON
--						)



----20) Hiển thị ngày nhập hàng gần nhất của cửa hàng.
--SELECT *
--FROM DDH INNER JOIN CT_DDH ON DDH.SoDDH = CT_DDH.SoDDH
--WHERE DATEDIFF(DAY,NgayDH ,GETDATE() ) <= ALL (
--				SELECT DATEDIFF(DAY,NgayDH ,GETDATE() )
--				FROM DDH
--			)





----21) Cho biết số lần mua hàng của khách có mã là ‘KH001’.
--SELECT COUNT(*) AS SOLANMUA
--FROM HOADON
--WHERE HOADON.MaKH ='KH01'



---22) Cho biết tổng tiền của từng hóa đơn.
--SELECT TONGTIEN.SoHD, SUM(TongTien)
--FROM  (SELECT HOADON.SoHD,  CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TongTien
--		FROM HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--		AS TONGTIEN
--GROUP BY TONGTIEN.SoHD
 



----23) Cho biết danh sách các hóa đơn gồm SoHD, NgaylapHD, MaKH, TenKH và tổng trị giá của từng
--			--HoaDon. Danh sách sắp xếp tăng dần theo ngày và giảm dần theo tổng trị giá của hóa đơn.
		
--SELECT TONGTIEN.SoHD, TONGTIEN.NgaylapHD, TONGTIEN.MaKH, TONGTIEN.TenKH      ,SUM(TongTien) AS TONGHOADON
--FROM  (SELECT HOADON.SoHD, HOADON.NgaylapHD, HOADON.MaKH, KH.TenKH, CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TongTien
--		FROM (
--				(HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--				INNER JOIN KH ON KH.MaKH=HOADON.MaKH
				
--				))	AS TONGTIEN 
--		--INNER JOIN KH ON KH.MaKH = HOADON.MaKH
--GROUP BY TONGTIEN.SoHD, TONGTIEN.NgaylapHD, TONGTIEN.MaKH, TONGTIEN.TenKH  







--24) Cho biết các hóa đơn có tổng trị giá lớn hơn tổng trị giá trung bình của các hóa đơn trong ngày 05/10/2010.


--SELECT TONGTIEN.SoHD, SUM(TongTien) AS TONGDOANHTHU
--FROM  (SELECT HOADON.SoHD,  CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TongTien
--		FROM HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--		AS TONGTIEN
--GROUP BY TONGTIEN.SoHD
--HAVING SUM(TONGTIEN.TongTien) >= ALL (

										
--							SELECT AVG(DOANHTHU.TONGTIENHOADON) AS TRUNGBINH
--							FROM (

--									SELECT TONGTIEN.SoHD, TONGTIEN.NgaylapHD ,SUM(TongTien) AS TONGTIENHOADON
--									FROM  (
--										SELECT HOADON.SoHD,HOADON.NgaylapHD  ,CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TongTien
--										FROM HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--									AS TONGTIEN
--									WHERE NgaylapHD = '05-10-2010'
--									GROUP BY TONGTIEN.SoHD, TONGTIEN.NgaylapHD)
--							AS DOANHTHU

--													)

--SELECT AVG(DOANHTHU.TONGTIENHOADON) AS TRUNGBINH
--FROM (

--		SELECT TONGTIEN.SoHD, TONGTIEN.NgaylapHD ,SUM(TongTien) AS TONGTIENHOADON
--		FROM  (
--			SELECT HOADON.SoHD,HOADON.NgaylapHD  ,CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TongTien
--			FROM HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--		AS TONGTIEN
--		WHERE NgaylapHD = '05-10-2010'
--		GROUP BY TONGTIEN.SoHD, TONGTIEN.NgaylapHD) AS DOANHTHU










--25) Cho biết số lượng từng NGK tiêu thụ theo từng tháng của năm 2010.

--SELECT NGK.TenNGK,  SUM(CT_HOADON.SLKHMua)
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE  YEAR(HOADON.NgaylapHD) = 2010
--GROUP BY CT_HOADON.MaNGK, HOADON.NgaylapHD, NGK.TenNGK








----26) Đưa ra danh sách NGK chưa được bán trong tháng 9 năm 2010.
--SELECT NGK.TenNGK, NGK.MaNGK, HOADON.NgaylapHD
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE NGK.MaNGK NOT IN (
--			SELECT NGK.MaNGK
--			FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--			WHERE YEAR(HOADON.NgaylapHD)= 2010
--				AND MONTH(HOADON.NgaylapHD) = 5
--	)
 



----27) Đưa ra danh sách khách hàng có địa chỉ ở TP.HCM và từng mua NGK trong tháng 9 năm 2010.
--SELECT NGK.TenNGK, NGK.MaNGK, HOADON.NgaylapHD, KH.TenKH, KH.DCKH
--FROM ( 
--		(HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--		INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--		INNER JOIN KH ON KH.MaKH= HOADON.MaKH )
--WHERE NGK.MaNGK  IN (
--			SELECT NGK.MaNGK
--			FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--			WHERE YEAR(HOADON.NgaylapHD)= 2010
--				AND MONTH(HOADON.NgaylapHD) = 5
--	)

--	AND KH.DCKH LIKE '%XVNT%'





----28) Đưa ra số lượng đã bán tương ứng của từng NGK trong tháng 5 năm 2010.
  
--SELECT NGK.TenNGK,  SUM(CT_HOADON.SLKHMua)
--FROM (HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--WHERE  YEAR(HOADON.NgaylapHD) = 2010
--		AND MONTH(HOADON.NgaylapHD) = 5
--GROUP BY CT_HOADON.MaNGK, HOADON.NgaylapHD, NGK.TenNGK

 







--29) Hiển thị thông tin khách hàng đã từng mua và tổng số lượng của từng NGK tại cửa hàng.

--SELECT NGK.TenNGK, NGK.MaNGK  ,KH.TenKH, SUM(CT_HOADON.SLKHMua) AS TONGSL
--FROM ( 
--		(HOADON INNER JOIN CT_HOADON ON HOADON.SoHD = CT_HOADON.SoHD)
--		INNER JOIN NGK ON NGK.MaNGK = CT_HOADON.MaNGK
--		INNER JOIN KH ON KH.MaKH= HOADON.MaKH )

--GROUP BY NGK.TenNGK, NGK.MaNGK  ,KH.TenKH
 




--30) Cho biết trong năm 2010, khách hàng nào đã mua nợ nhiều nhất.
	--SELECT BANG1.MaKH, SUM(BANG1.SONO) AS TONGNO
	--FROM (
	--		SELECT KH.MaKH, SUM(PHIEUTRANO.SoTienTra) AS SONO
	--		FROM (HOADON INNER JOIN KH ON KH.MaKH = HOADON.MaKH)
	--				INNER JOIN PHIEUTRANO ON PHIEUTRANO.SoHD = HOADON.SoHD
	--		GROUP BY KH.MaKH, HOADON.SoHD	
	--						)
	--AS BANG1
	--GROUP BY BANG1.MaKH
	--HAVING SUM(BANG1.SONO) >= ALL (
	--		SELECT SUM(BANG1.SONO) AS TONGNO
	--		FROM (
	--					SELECT KH.MaKH, SUM(PHIEUTRANO.SoTienTra) AS SONO
	--					FROM (HOADON INNER JOIN KH ON KH.MaKH = HOADON.MaKH)
	--					INNER JOIN PHIEUTRANO ON PHIEUTRANO.SoHD = HOADON.SoHD
	--					GROUP BY KH.MaKH, HOADON.SoHD	
	--						)
	--			AS BANG1
	--			GROUP BY BANG1.MaKH)




--31) Có bao nhiêu hóa đơn chưa thanh toán hết số tiền?

--SELECT COUNT (*) AS TONGSOHOADON
--FROM (
--		SELECT HOADON.SoHD
--		FROM (HOADON INNER JOIN KH ON KH.MaKH = HOADON.MaKH)
--			INNER JOIN PHIEUTRANO ON PHIEUTRANO.SoHD = HOADON.SoHD
--		GROUP BY HOADON.SoHD
--		) AS BANG1 



--32) Liệt kê các hóa đơn cùng tên của khách hàng tương ứng đã mua NGK và thanh toán tiền đầy đủ 1 lần. (Không có phiếu trả nợ)
	
	--SELECT *
	--FROM (HOADON INNER JOIN KH ON KH.MaKH = HOADON.MaKH)
		 
	--WHERE HOADON.SoHD NOT IN (
	--				SELECT HOADON.SoHD
	--				FROM (HOADON INNER JOIN KH ON KH.MaKH = HOADON.MaKH)
	--					INNER JOIN PHIEUTRANO ON PHIEUTRANO.SoHD = HOADON.SoHD
	--				GROUP BY HOADON.SoHD
	--				)





 



----33) Thông kê cho biết thông tin đặt hàng của cửa hàng trong năm 2010: Mã NGK, Tên NGK, Tổng SL đặt.

--SELECT NGK.MaNGK, NGK.TenNGK, SUM(CT_DDH.SLDat)
--FROM (DDH INNER JOIN CT_DDH ON CT_DDH.SoDDH = DDH.SoDDH) 
--		INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK
--WHERE YEAR(DDH.NgayDH) = 2011
--GROUP BY NGK.MaNGK, NGK.TenNGK

--SELECT NGK.MaNGK, NGK.TenNGK
--FROM (DDH INNER JOIN CT_DDH ON CT_DDH.SoDDH = DDH.SoDDH) 
--		INNER JOIN NGK ON NGK.MaNGK = CT_DDH.MaNGK





----34) Để thuận tiện trong việc tặng quà Tết cho khách hàng, hãy liệt kê danh sách khách
----hàng đã mua NGK với tổng số tiền tương ứng trong năm 2010 (hiển thị giảm dần theo số tiền đã mua)

--SELECT BANG.MaKH, SUM(BANG.TONGTIEN) AS TONGTIENDAMUA
--FROM (
--		SELECT KH.MaKH, CT_HOADON.SLKHMua * CT_HOADON.DGBan AS TONGTIEN
--		FROM (HOADON INNER JOIN CT_HOADON ON CT_HOADON.SoHD = HOADON.SoHD) 
--			INNER JOIN KH ON KH.MaKH = HOADON.MaKH
--		WHERE YEAR(HOADON.NgaylapHD) = 2010	 
--		) AS BANG

--GROUP BY BANG.MaKH






































