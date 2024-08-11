package Lab_Decorate_Beverage;

public class Mocha  extends CondimentDecorator{
	
	
	
	public Mocha(Beverage beverage) {
		super(beverage);
		 
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getDescription() {
	
		return "Mocha";
	}

}
