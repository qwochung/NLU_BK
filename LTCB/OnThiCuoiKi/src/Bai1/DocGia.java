package Bai1;

public class DocGia {
	String name,email;
	LstItem lstItem;
	/**
	 * @param name
	 * @param email
	 * @param lstItem
	 */
	public DocGia(String name, String email, LstItem lstItem) {
		super();
		this.name = name;
		this.email = email;
		
		
		
		this.lstItem = lstItem;
	}
	@Override
	public String toString() {
		return "Tên Đọc giả : " + name + ", email  " + email + "\n" + " lstItem : " + lstItem  ;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
