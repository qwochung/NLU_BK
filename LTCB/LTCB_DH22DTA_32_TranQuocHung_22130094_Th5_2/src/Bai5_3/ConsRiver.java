package Bai5_3;

public class ConsRiver implements LstRiver {
	River first;
	LstRiver rest ;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsRiver(River first, LstRiver rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	

}
