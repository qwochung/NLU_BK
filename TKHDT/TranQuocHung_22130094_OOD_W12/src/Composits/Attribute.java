package Composits;


public class Attribute {
	String key, value;
	
	public Attribute(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	String getKey() {
		return key;
	}

	void setKey(String key) {
		this.key = key;
	}

	String getValue() {
		return value;
	}

	void setValue(String value) {
		this.value = value; 
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Attribute)) {
			return false;
			
		}
		else {
			Attribute attribute = (Attribute)obj;
			return this.getKey().equals(attribute.getKey()) &&
					this.getValue().equals(attribute.getValue());
		}
	}

	@Override
	public String toString() {
		if (key == null || value ==null) {
			return "";
		}
		return " key=" + key + ", value=" + value ;
	}
	
	
	
	
	

}
