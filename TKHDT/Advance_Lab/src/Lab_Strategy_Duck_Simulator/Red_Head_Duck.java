package Lab_Strategy_Duck_Simulator;

public class Red_Head_Duck extends Duck_Simulator {

	public Red_Head_Duck() {
		super();
		quack_Behavior = new Quack();
		fly_Behavior = new Fly_Rocket_Powerr();
	}

	@Override
	public void display() {
		System.out.println("I am Red Head Duck ");
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
