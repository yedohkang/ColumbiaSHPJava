// Yedoh Kang
// Accelerated -- LAB #2
// 10/8/16

public class LockTester {
	
	public static void main (String [] args) {
		
		// combo: (0, 0, 0)
		System.out.println("Test1: Combo (0, 0, 0)");
		ComboLock test1 = new ComboLock (0, 0, 0);
		test1.firstTurnRight(0);
		test1.secondTurnLeft(0);
		test1.thirdTurnRight(0);
		System.out.println(test1.open()); // should be success
		
		// combo: (5, 10, 20)
		System.out.println("Test2: Combo (5, 10, 20)");
		ComboLock test2 = new ComboLock (5, 10, 20);
		test2.firstTurnRight(20);
		test2.secondTurnLeft(30);
		test2.thirdTurnRight(10);
		System.out.println(test2.open()); // should be try again
		
		// combo: (5, 10, 20)
		System.out.println("Test3: Combo (5, 10, 20)");
		ComboLock test3 = new ComboLock (5, 10, 20);
		test3.firstTurnRight(20);
		test3.secondTurnLeft(21);
		test3.reset();
		test3.firstTurnRight(20);
		test3.secondTurnLeft(30);
		test3.thirdTurnRight(15);
		System.out.println(test3.open()); // should be success
	}
}