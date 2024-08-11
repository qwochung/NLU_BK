package VD2;

public class ConsLog implements ILog {
	Entry first;
	ILog rest;

	/**
	 * @param frist
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	
	
	
	@Override
	public String toString() {
		return this.first.toString() + " \n" + this.rest.toString();
	}

	
	
	
	
	
	
	
	public ILog insertInDistanceOrder(Entry e) {

		if (e.hasDistanceShorterThan(this.first))

			return new ConsLog(e, this);

		else

			return new ConsLog(this.first, this.rest.insertInDistanceOrder(e));

	}
	
	
	
	
	@Override
	public ILog sortByDistance() {
		return this.rest.sortByDistance().insertInDistanceOrder(this.first);

	}


	
	
	
	
	
	
	
	
	
	


	@Override
	public double totalDistance(int month) {
		// TODO Auto-generated method stub
		return this.first.totalDistance (month) + this.rest.totalDistance(month);
	}




	@Override
	public double maxDistance() {
		double max = 0;
		if (this.first.getDistance () > max)
			max = this.first.getDistance()	;
			this.rest.maxDistance() ;
		
			return max ;
	}

	
	
	
	
	
	
}
