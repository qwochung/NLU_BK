package Lab_Decorate_Beverage;

public  abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	
	
	
	





	protected CondimentDecorator(Beverage beverage) {
		
		this.beverage = beverage;
	}









	@Override
	public abstract String getDescription();
	
}
