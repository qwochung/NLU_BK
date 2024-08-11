package Lab_Strategy_Duck_Simulator;

public class MuteQuack implements Quack_Behavior {

	@Override
	public void quack() {
		System.out.println("Duck can not quack!");
	}

}
