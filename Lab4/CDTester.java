// Yedoh Kang
// Accelerated Java 
// Lab 4

public class CDTester {
	
	public static void main (String[] args) {
		
		CDCollection yedoh = new CDCollection();
		
		// add CD's
		
		yedoh.addCD("1989", "Taylor Swift", 12, 5);
		//yedoh.addCD("Graduation", "Kanye West", 13, 8);
		yedoh.addCD("Joy to the World", "Pentatonix", 14, 6);
		yedoh.addCD("Let There Be Light", "Hillsong", 15, 8);
		yedoh.addCD("22", "Adele", 11, 9);
		yedoh.addCD("Empires", "Hillsong", 15, 9);
		yedoh.addCD("Lemonade", "Beyonce", 12, 15);
		
		// remove CD's
		
		//yedoh.removeCD("Joy to the World");
		yedoh.removeCD("Lemonade");
		
		System.out.println("\nFinal (after removal): \n");
		System.out.println(yedoh);
	}
}