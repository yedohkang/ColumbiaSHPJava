// Yedoh Kang
// Accelerated Java 
// FINAL PROJECT

import java.util.Scanner;
import java.io.*;

public class CDTester {
	
	private static int count = 1;
	private static String collectionName;
	
	public static void main (String[] args) throws FileNotFoundException {
		
		// allows user to build their own CD Collection from terminal input
		
		/*
			CDCollection yedoh = new CDCollection();
		
			// add CD's
			yedoh.addCD("1989", "Taylor Swift", 12, 5);
			yedoh.addCD("Joy to the World", "Pentatonix", 14, 6);
			yedoh.addCD("Let There Be Light", "Hillsong", 15, 8);
			yedoh.addCD("22", "Adele", 11, 9);
			yedoh.addCD("Empires", "Hillsong", 15, 9);
			yedoh.addCD("Lemonade", "Beyonce", 12, 15);
		
			System.out.println(yedoh);
			*/
			
			Scanner input = new Scanner (System.in);
		
		System.out.println("What do you want to name your CD Collection?");
		collectionName = input.nextLine();
		
		// new object
		CDCollection test = new CDCollection();

		System.out.println("Let's add CDs to your collection, " + collectionName + "! ");
		
		System.out.println("\tCD #1");
		
		System.out.print("Title: ");
		String title1 = input.nextLine();
		
		System.out.print("Arist: ");
		String artist1 = input.nextLine();
		
		System.out.print("Cost: ");
		double cost1 = input.nextDouble();
		
		System.out.print("# of Tracks: ");
		int tracks1 = input.nextInt();
		String nothing = input.nextLine();
		
		count += 1;
		
		// adds CD to collection
		test.addCD(title1,artist1,cost1,tracks1);
		
		System.out.print("Add another CD? (y/n): ");
		String reply = input.nextLine();
		
		// if >1 CD
		while (reply.equals("y") == true) {
			System.out.println("\tCD #" + count);
	
			System.out.print("Title: ");
			String title = input.nextLine();
	
			System.out.print("Arist: ");
			String artist = input.nextLine();
	
			System.out.print("Cost: ");
			double cost = input.nextDouble();
	
			System.out.print("# of Tracks: ");
			int tracks = input.nextInt();
			nothing = input.nextLine();
			
			count += 1;
	
			test.addCD(title,artist,cost,tracks);
	
			System.out.print("Add another CD? (y/n): ");
			reply = input.nextLine();
		}
		
		// creates and writes a new file
		PrintWriter outfile = new PrintWriter(collectionName + ".txt");
		String output = test.toString(); 
		outfile.println(output);
		outfile.close();
			
		System.out.println("\n ------------- \n Here is your CD Collection, " + collectionName + "! A text file was also created.");
		System.out.println(test);
	
	}
}