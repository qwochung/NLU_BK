package thigk;

public class MTEmployee implements LstEmployee {

	@Override
	public String toString() {
		return "";
	}

	@Override
	public LstEmployee getDriver(String name) {
		// TODO Auto-generated method stub
		return new MTEmployee();
	}

}
