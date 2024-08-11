package Task1;

public class OrderItem {
	Product item;
	int amount;
	public OrderItem(Product item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "\n"+"OrderItem [item=" + item.toString() + ", amount=" + amount + "]";
	}
	/**
	 * @return the item
	 */
	public Product getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Product item) {
		this.item = item;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getPrice() {
		return item.getPrice();
	}
	
	
	public String getType() {
		return item.getType();
	}
}
