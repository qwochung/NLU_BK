package Bai5_3;

public class ConsConfluence implements LstConfluence {
	Confluence first ;
	LstConfluence rest ;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsConfluence(Confluence first, LstConfluence rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

}
