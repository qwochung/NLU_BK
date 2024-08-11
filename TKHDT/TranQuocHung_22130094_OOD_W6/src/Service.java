
public abstract class Service {
	int id;
	String ten;
	
	
	public Service(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}


	protected abstract int cost();


	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getTen() {
		return ten;
	}


	void setTen(String ten) {
		this.ten = ten;
	}


	protected abstract void bill();
	
	
	
}
