package Lab_Strategy_Duck_Simulator;

public abstract class Duck_Simulator {
	Fly_Behavior fly_Behavior;
	Quack_Behavior quack_Behavior;
	
	
	
	
	
	public abstract void performQuack();
	
	public abstract void performFly();
	
	public abstract void display();
	
	public abstract void setFlyBehavior ( Fly_Behavior fly_Behavior) ;
	
	public abstract void set_Quack_Behavior ( Quack_Behavior quack_Behavior) ;
	
	
	
	public void swim() {
		System.out.println("I am swimming");
		
	};
	
	
	
	
	 
	
}
