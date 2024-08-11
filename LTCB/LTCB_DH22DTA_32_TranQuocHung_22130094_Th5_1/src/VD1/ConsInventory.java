package VD1;

public class ConsInventory implements Inventory {
	Toy first;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	Inventory rest;
	
	
	
	
	@Override
	public String toString() {
		return this.first.toString();
	}

}
