package Bai5_1;

public class AHouse implements ListHouse {
	House first ;
	ListHouse rest ;
	/**
	 * @param first
	 * @param rest
	 */
	public AHouse(House first, ListHouse rest) {
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
