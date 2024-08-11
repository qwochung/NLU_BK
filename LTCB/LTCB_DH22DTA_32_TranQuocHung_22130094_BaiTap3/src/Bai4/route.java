package Bai4;

public class route {
	String origin;
	String destinationStation ;
	public route(String origin, String destinationStation) {
		super();
		this.origin = origin;
		this.destinationStation = destinationStation;
	}
	
	
	
//	delegate from trainStrip
	public boolean destination(String destination2) {
		// TODO Auto-generated method stub
		return this.destinationStation.equals(destination2);
	}
	
	
	


}
