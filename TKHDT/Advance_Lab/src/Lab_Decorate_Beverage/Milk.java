package Lab_Decorate_Beverage;

public class Milk  extends CondimentDecorator{

	
	
	
	
	public Milk(Beverage beverage) {
		super(beverage);
		
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 5 + beverage.cost();
	}

	@Override
	public String getDescription() {
	
		return "Milk";
	}

}
