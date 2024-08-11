package Bai1;

public class Consitem  implements LstItem {
	RentItem lst;
	LstItem rest;
	/**
	 * @param lst
	 * @param rest
	 */
	public Consitem(RentItem lst, LstItem rest) {
		super();
		this.lst = lst;
		this.rest = rest;
	}
	
	
	
	
	@Override
	public String toString() {
		return "\n" + lst.toString() +  rest.toString() ;
	}




	
	
	
	
	
	

}
