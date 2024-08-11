package Bai3;

/**
 * Provides the data 
definition for a weather 
recording program.
 * @author ADMIN
 * example : 
 * 		date day1 = new date(12, 10, 2020);
		temperatureRange today = new temperatureRange(29, 40);
		temperatureRange nomal = new temperatureRange( 25, 40);
		temperatureRange record = new temperatureRange(25, 35);
	
		weartherRecord w1 = new weartherRecord(day1, today, nomal, record, 28.0);
 *
 */

public class weartherRecord {
	date day;
	temperatureRange today;
	temperatureRange nomal;
	temperatureRange record;
	double precipitation;
	
	public weartherRecord(date day, temperatureRange today, temperatureRange nomal, temperatureRange record,
			double precipitation) {
		super();
		this.day = day;
		this.today = today;
		this.nomal = nomal;
		this.record = record;
		this.precipitation = precipitation;
	}
	
	
	/**
	 * withinRange, which determines whether today's high and low were within the normal range
	 * example:
	 * w1.withInRange(this.nomal)  =>  True
	 */	
	
	
	public boolean withInRange(temperatureRange nomal) {
//		return this.today.withInRange(nomal); 
		return this.today.equal(nomal);
	}
	
	
	
	/**
	 * rainyDay, which determines whether the precipitation is
	 * higher than some given value
	 * 
	 * 		example:
	 * 				w1.rainyDay(10.48)    => True
	 * 				w1.rainyDay(49.12)    => False
	 * 
	 * 
	 * 

	 */
	
	public boolean rainyDay (double precipitation2) {
		if (this.precipitation > precipitation2)
			return true;
		
		else return false;
		
		
	}
	
	
	
	/**
	 * recordDay, which determines whether the temperature
	 * today broke either the high or the low record.
	 * 
	 * 		example: 
	 * 	record ( 25 , 40)
	 * 	today ( 23 , 35 ) => True
	 * 	today ( 30 , 35) => False
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	public boolean recordDay () {
	
		if (this.today.equal(record) == true )
			return false;
		else return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
