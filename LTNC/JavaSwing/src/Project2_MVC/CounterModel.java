package Project2_MVC;

public class CounterModel {
	int value;

	public CounterModel() {
		this.value = 0;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public void increase() {
		this.value++;
	}
	
	
	public void decrease() {
		this.value--;
		
	}
	
	public void reset() {
		this.value=0;
	}
}
