package Lab_Decorate_Beverage;

public class Whip  extends CondimentDecorator{

	
		
	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public String getDescription() {
	
		return "Whip";
	}

}
