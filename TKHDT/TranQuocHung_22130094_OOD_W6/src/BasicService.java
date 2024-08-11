
public class BasicService extends  Service{

	public BasicService(int id, String ten) {
		super(id, ten);
	}

	@Override
	protected int cost() {
		return 40000;
	}
	 
	
	@Override
	protected void bill() {
		System.out.println(  "		"+ getTen() + "								" + cost() + "$");
	}
	
	
}
