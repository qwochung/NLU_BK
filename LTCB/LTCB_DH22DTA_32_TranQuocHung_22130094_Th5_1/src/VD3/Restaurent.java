package VD3;

public class Restaurent {
	String name, food, priceRange;
	Intersection	intersection;
	/**
	 * @param name
	 * @param food
	 * @param priceRange
	 * @param intersection
	 */
	public Restaurent(String name, String food, String priceRange, Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}
	@Override
	public String toString() {
		return "Restaurent  " + name + ", food :" + food + ", priceRange : " + priceRange + ", intersection : "
				+ intersection.toString() ;
	}
	
	

}
