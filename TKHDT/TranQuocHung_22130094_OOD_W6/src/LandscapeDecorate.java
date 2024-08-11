
public class LandscapeDecorate  extends DecorateService {
	public LandscapeDecorate(int id, String ten, Service service) {
		super(id, ten, service);
		checkService();
		
	}

	
	
	
	@Override
	protected int cost() {
		if (service== null) {
			return 1000;
		}
		
		return 1000 + service.cost();
	}


	


	
	@Override
	protected void bill() {
		System.out.println("		"+ getTen() + " , "+ service.getTen() + "								" + cost() + "$");

	}
	
	
}
