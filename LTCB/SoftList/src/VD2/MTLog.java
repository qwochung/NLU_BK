package VD2;

public class MTLog implements ILog {

	@Override
	public String toString() {
		return " ";
	}

	
	
	
	
	
	
	@Override
	public ILog sortByDistance() {
		// TODO Auto-generated method stub
		return new MTLog() ;
	}

	public ILog insertInDistanceOrder(Entry e) {

		return new ConsLog(e, new MTLog());

		}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public double totalDistance(int month) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	@Override
	public double maxDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
