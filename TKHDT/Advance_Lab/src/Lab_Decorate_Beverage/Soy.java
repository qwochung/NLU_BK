package Lab_Decorate_Beverage;

public class Soy  extends CondimentDecorator{

	
	
	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getDescription() {
	
		return "Soy";
	}

}
