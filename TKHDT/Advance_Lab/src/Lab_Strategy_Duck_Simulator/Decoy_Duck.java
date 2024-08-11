package Lab_Strategy_Duck_Simulator;

public class Decoy_Duck extends  Duck_Simulator{
	 
	
	public Decoy_Duck() {
		super();
		quack_Behavior = new MuteQuack();
		fly_Behavior = new Fly_No_Way();
	}

	@Override
	public void display() {
		System.out.println("I am Decoy Duck");
	}

	@Override
	public void performQuack() {
		quack_Behavior.quack();
		
	}

	@Override
	public void performFly() {
		fly_Behavior.fly();
	}

	@Override
	public void setFlyBehavior(Fly_Behavior fly_Behavior) {
		this.fly_Behavior = fly_Behavior;
	}

	@Override
	public void set_Quack_Behavior(Quack_Behavior quack_Behavior) {
		this.quack_Behavior = quack_Behavior;
	}
}
