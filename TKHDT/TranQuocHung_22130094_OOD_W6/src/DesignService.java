
public class DesignService  extends Service {

	public DesignService(int id, String ten) {
		super(id, ten);
	}

	@Override
	protected int cost() {
		// TODO Auto-generated method stub
		return 2000;
	}

	
	
	

	@Override
	protected void bill() {
		System.out.println( "		"+ getTen() + "								" + cost() + "$");
	}
	
	

}
