/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public class temperatureRange {
	int low, high;

	public temperatureRange(int low, int high) {
		super();
		this.low = low;
		this.high = high;
	}

	
	
	
	//delegate of withInRange in weartherRecord
//	
//	public boolean withInRange(temperatureRange nomal) {
//		// TODO Auto-generated method stub
//		if (this.low >= nomal.low && this.high <= nomal.high )
//			return true;
//		else return false;
//	}

	
	
	public boolean equal(Object obj) {
		if (obj == null || !(obj instanceof temperatureRange))
			return false;
		else 
			{temperatureRange that = (temperatureRange ) obj;
		
			return this.low >= that.low && this.high <= that.high;
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
