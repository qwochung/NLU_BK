import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KhachHang {
	int CCCD;
	String ten;
	String quocTich;
	LocalDate ngayDen, ngayDi;
	List<ProductDichVu> dsDichVu = new ArrayList<ProductDichVu>();
	
	
	public KhachHang(int cCCD, String ten, String quocTich, LocalDate ngayDen, LocalDate ngayDi,
			List<ProductDichVu> dsDichVu) {
		super();
		CCCD = cCCD;
		this.ten = ten;
		this.quocTich = quocTich;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.dsDichVu = dsDichVu;
	}
	
}
