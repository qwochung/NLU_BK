package Lab_Strategy_Duck_Simulator;

public class Fly_No_Way  implements Fly_Behavior{

	@Override
	public void fly() {
		System.out.println("Can not Fly");
	}

}
