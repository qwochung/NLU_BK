package VD2;

public class ConsLog implements ILog {
	Entry frist ;
	ILog rest ;
	/**
	 * @param frist
	 * @param rest
	 */
	public ConsLog(Entry frist, ILog rest) {
		super();
		this.frist = frist;
		this.rest = rest;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return this.frist.toString() + " \n" + 
				this.rest.toString();
	}

}
