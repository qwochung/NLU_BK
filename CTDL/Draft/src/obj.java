
public class obj {
	String aString ;

	public obj(String aString) {
		super();
		this.aString = aString;
	}

	@Override
	public String toString() {
		return "obj [aString=" + aString + "]";
	}

	/**
	 * @return the aString
	 */
	public String getaString() {
		return aString;
	}

	/**
	 * @param aString the aString to set
	 */
	public void setaString(String aString) {
		this.aString = aString;
	}

}
