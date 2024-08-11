package VD5;

public class Source extends ARiver {

	public Source(Location location, double length) {
		super(location, length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Source " + this.location.toString() + " length " + this.length + "\n";
	}
	

}
