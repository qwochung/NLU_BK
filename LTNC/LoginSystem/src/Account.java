
public class Account {

	String name, pass;

	public Account(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj== this) {
			return true;}
		
		if (!(obj instanceof Account)) {
			return false;
		}
		Account objAccount = (Account) obj;
		return this.getName().equals(objAccount.getName());
	}

	
	
}

