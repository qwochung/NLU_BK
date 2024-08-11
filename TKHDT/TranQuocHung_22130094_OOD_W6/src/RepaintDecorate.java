
public class RepaintDecorate extends DecorateService {

	

	public RepaintDecorate(int id, String ten, Service service) {
		super(id, ten, service);
		checkService();
		}

	@Override
	protected int cost() {
		if (service == null) {
			return 500;
		}
		return 500 + service.cost();
	}


	
	@Override
	protected void bill() {
		System.out.println("		"+ getTen() + " , "+ service.getTen() + "								" + cost() + "$");

	}
	
}
