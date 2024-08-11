package VD3;

public class ConsRestaurant implements IRestaurant{
	Restaurent first;
	IRestaurant rest ;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsRestaurant(Restaurent first, IRestaurant rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first.toString() + "\n"
				+ this.rest.toString();
	}
	
	

}
