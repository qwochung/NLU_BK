SELECT * FROM chuongtrinhdaotao;

UPDATE chuongtrinhdaotao
SET SoTinChi = SoTinChi + 10
WHERE (MaCT = "CNTT");

SELECT * FROM chuongtrinhdaotao;