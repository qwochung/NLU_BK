package Lab_Strategy_Duck_Simulator;

public class Test {
	public static void main(String[] args) {
		
		Duck_Simulator mallard = new Mallard_Duck();
		Duck_Simulator red_head = new Red_Head_Duck();
		Duck_Simulator rubber = new Rubber_Duck();
		Duck_Simulator decoy = new Decoy_Duck();
		
		
		
		
		
//		mallard duck test
		System.out.println("Mallard duck :");
		mallard.performQuack();
		mallard.swim();
		mallard.display();
		mallard.performFly();
		
		
//		red_head duck test
		System.out.println("\nred_head duck :");
		red_head.performQuack();
		red_head.swim();
		red_head.display();
		red_head.performFly();
		
//		rubber duck test
		System.out.println("\nrubber duck : ");
		rubber.performQuack();
		rubber.swim();
		rubber.display();
		rubber.performFly();
		
//		decoy duck test
		System.out.println("\ndecoy duck : ");
		decoy.performQuack();
		decoy.swim();
		decoy.display();
		decoy.performFly();

	}

}
