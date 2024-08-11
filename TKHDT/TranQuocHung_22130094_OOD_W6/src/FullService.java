
public class FullService extends Service {

	public FullService(int id, String ten) {
		super(id, ten);
	}

	@Override
	protected int cost() {
		// TODO Auto-generated method stub
		return 60000;
	}
	

	@Override
	protected void bill() {
		System.out.println( "		"+ getTen() + "								" + cost() + "$");
	}
	

}
