package Bai5_3;

public class RiverSystem {
	LstRiver source ;
	LstConfluence confluence ;
	Mouth mouth ;
	/**
	 * @param source
	 * @param confluence
	 * @param mouth
	 */
	public RiverSystem(LstRiver source, LstConfluence confluence, Mouth mouth) {
		super();
		this.source = source;
		this.confluence = confluence;
		this.mouth = mouth;
	}
	

}
