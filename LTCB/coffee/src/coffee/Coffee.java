package coffee;

public class Coffee {
	String ten;
	double gia;
	int khoiluong;
	
	Coffee( String ten, double gia, int khoiluong){
		this.ten=ten;
		this.gia=gia;
		this.khoiluong= khoiluong;
	}
	
		
//		tạo bien  xem giá của khoiluong x gia bằng bao nhiêu, sau đó so sánh có vượt qua số tiền trong túi ko?!
		
	double sotien() {
		return  this.gia * this.khoiluong;
		
	}
//	tại đây sẽ return giá trị của sotien
	
}
