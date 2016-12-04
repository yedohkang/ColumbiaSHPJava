// Yedoh Kang
// Accelerated Java 
// Lab 4

public class CDTester {
	
	
	public static void main (String[] args) {
		CDCollection test = new CDCollection();
		test.addCD("test", "Adele", 12, 5);
		test.addCD("asdf", "Pentatonix", 14, 6);
		test.addCD("rasdf", "Mx", 15, 8);
		System.out.println(test);
	}
}