package Bai4;


/**
 * Develop a program that can assist railway travelers with the
arrangement of train trips.

The available information about a specific train includes its
schedule, its route, and whether it is local.

The route information consists of the origin and the
destination station.

A schedule specifies the departure and the arrival (clock)
times when the train leaves and when it arrives.

ClockTime consists of the hour (of the day) and the minutes
(of the hour).
 * @author ADMIN
 * example :
	 	route route1 =new route ("Ben Tre", "TP.HCM");
		clockTime clockTimeLeave = new clockTime(12, 30);
		clockTime clockTimeArrivel = new clockTime(22, 30);
		
		schedule schedule1= new schedule(clockTimeLeave, clockTimeArrivel);
		
		trainStrip trainStrip1= new trainStrip(schedule1, route1, true);
 *
 */
public class trainStrip {
	schedule schedule;
	route route;
	boolean local;
	

	public trainStrip(Bai4.schedule schedule, Bai4.route route, boolean local) {
		super();
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}


	

	
/**
 * 	Does his destination station match the destination
	of the traintrip?	
 * @param destination2 : his destination station
 * 
 * @return
 * example :
 * 		trainStrip1.destination("TP.HCM") => True
 * 		trainStrip1.destination("Ha Noi") => False
 */
	

	public boolean destination  (String destination2) {
		return this.route.destination(destination2);
	}
	
	
	/**
	 * What time does the train start ?
	 * 	example :
	 * 		trainStrip1.whatTime() =>  clockTime out ( 12,30) 
	 */
	
	public clockTime whatTime () {
		return this.schedule.whatTime();
	}
	
	

	
	/**
	 * How long does the train trip take?
	 *  	example:
	 *  
	 */
	
	
	public clockTime howLong () {
		return this.schedule.howLong();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
