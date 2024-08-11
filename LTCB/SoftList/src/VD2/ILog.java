package VD2;

public interface  ILog {
	public ILog sortByDistance ()	;
	
	public ILog insertInDistanceOrder(Entry e);
	
	
	
	
	
	
	/**
	 * Suppose the requirements for the program that tracks a runner's log includes this request: 
	 * ... The runner wants to know the total distance run in a given month...
	 * @param month
	 * @return
	 */
	
	public double totalDistance (int month);
	
	
	
	
	
	/**
	 * Suppose the requirements for the program that tracks a runner's log includes this request: 
	 * ... A runner wishes to know the maximum distance ever run ...
	 * Design the method that computes this number. Assume that the method produces 0 if the log is empty. 
	 */

	
	
	public double maxDistance (  );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
