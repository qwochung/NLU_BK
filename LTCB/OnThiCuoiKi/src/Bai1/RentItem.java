package Bai1;

public class RentItem {
	LibraryItem item;
	int rentedDays;
	/**
	 * @param item
	 * @param rentedDays
	 */
	public RentItem(LibraryItem item, int rentedDays) {
		super();
		this.item = item;
		this.rentedDays = rentedDays;
	}
	@Override
	public String toString() {
		return  item + ", RentedDays : " + rentedDays  ;
	}
	public double fine() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
