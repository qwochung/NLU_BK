package Task1;

import java.time.LocalDate;

public class Product {
	String name, type;
	int price;
	LocalDate expireDate;
	public Product(String name, String type, int price, LocalDate expireDate) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.expireDate = expireDate;
	}
	@Override
	public String toString() {
		return "\n"+"Product [name=" + name + ", type=" + type + ", price=" + price + ", expireDate=" + expireDate + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the expireDate
	 */
	public LocalDate getExpireDate() {
		return expireDate;
	}
	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

}
