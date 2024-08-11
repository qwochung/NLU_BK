package Lab_Decorate_Beverage;

public class Test {
	
	public static void main(String[] args) {
		
		Beverage darkRoast = new DarkRoast();
		Beverage decaf = new Decaf();
		Beverage expresso = new Expresso();
		Beverage houseBlend = new HouseBlend();
		
		CondimentDecorator milk = new Milk(darkRoast);
		CondimentDecorator mocha = new Mocha(darkRoast);
		CondimentDecorator soy = new Soy(decaf);
		CondimentDecorator whip = new Whip(expresso);
		
		
		
		System.out.println(milk.cost());
		
		
		
	}

}
