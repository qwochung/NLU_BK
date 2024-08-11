package VD5;

public class Location {
	int x,y;
	String name;
	/**
	 * @param x
	 * @param y
	 * @param name
	 */
	public Location(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", name = " + name ;
	}
	
}
