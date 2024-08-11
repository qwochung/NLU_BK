package HocVien;



public abstract class NhanVien {
	
	int id;
	String hoVaten ;
	String trinhDo ;
	double luong;
	public NhanVien(int id, String hoVaten, String trinhDo, double luong) {
		super();
		this.id = id;
		this.hoVaten = hoVaten;
		this.trinhDo = trinhDo;
		this.luong = luong;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoVaten() {
		return hoVaten;
	}
	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	
	public void setLuong(double luong) {
		this.luong = luong;
	}



	public abstract double getLuong() ;











	@Override
	public abstract String toString() ;	
	
	
	
	
}
