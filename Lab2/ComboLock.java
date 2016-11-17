// Yedoh Kang
// Accelerated -- LAB 2
// 10/8/16

public class ComboLock {
	
	// instance variables
	// original combo (user input)
	private int userFirst;
	private int userSecond;
	private int userThird;
	private int tryFirst;
	private int trySecond;
	private int tryThird;
	private int current = 0;
	private Boolean checkFirst = false;
	private Boolean checkSecond = false;
	private Boolean checkThird = false;

	// default constructor
	public ComboLock () {
		userFirst = 0;
		userSecond = 0;
		userThird = 0;
	}
	
	// overloaded constructor
	public ComboLock (int secret1, int secret2, int secret3) {
		// if [0,24], set first combo
		if (secret1 >= 0 && secret1 <= 24) {
			userFirst = secret1;
		}
		// else set to 0
		else {
			userFirst = 0;
		}
		// if [0,24], set first combo
		if (secret1 >= 0 && secret1 <= 24) {
			userSecond = secret2;
		}
		// else set to 0
		else {
			userSecond = 0;
		}
		// if [0,24], set first combo
		if (secret1 >= 0 && secret1 <= 24) {
			userThird = secret3;
		}
		// else set to 0
		else {
			userThird = 0;
		}
	}
	
	// methods
	
	// if user messes up, set inputs to 0
	public void reset () {
		checkFirst = false;
		checkSecond = false;
		checkThird = false;
	}
	
	public void firstTurnRight (int ticks) {
		/*
		int amtTicks;
		amtTicks = ticks % 25;
		if (amtTicks == 0) {
			current = 0;
		}
		else {
			current = 25 - ticks;
		}
		if (current == userFirst) {
			checkFirst = true;
		}
		else {
			checkFirst = false;
		}
			*/
		
		int amtTicks;
		amtTicks = ticks % 25;
		if (amtTicks == 0) {
			current = 0;
		}
		else {
			current = 25 - amtTicks;
		}
		if (current == userFirst) {
			checkFirst = true;
		}
	}

	public void secondTurnLeft (int ticks) {
		int amtTicks;
		amtTicks = ticks % 25;
		current = amtTicks + current;
		current = current % 25;
		if (current == userSecond) {
			checkSecond = true;
		}
		else {
			checkSecond = false;
		}
	}

	
	public void thirdTurnRight (int ticks) {
		int amtTicks;
		amtTicks = ticks % 25;
		current = Math.abs(0 - current);
		amtTicks = amtTicks - current;
		if (amtTicks == 0) {
			current = 0;
		}
		else {
			current = 25 - amtTicks;
		}
		if (current == userThird) {
			checkThird = true;
		}
	}

	
	public Boolean open () {
		if (checkFirst == checkSecond == checkThird == true) {
			System.out.println ("Success!");
			return true;
		}
		else {
			System.out.println ("Please try again!");
			return false;
		}
	}
}