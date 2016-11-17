// Yedoh Kang
// Accelerated -- LAB #3
// 10/15/16

import java.util.Scanner;
import java.io.*;

public class BabyNames {
	
	public static void boyName (String year, int rank) throws FileNotFoundException {
		
		String year1 = year;
		String rank1 = "" + rank;
		String text = "";
		String name = "";
		String number = "";
		int rankline = rank - 1;
		int place = 7 + 5 * rankline;
		
		Scanner input = new Scanner (new FileReader(year1 + ".txt"));
		
		while (input.hasNextLine()) {
			text += input.nextLine() + "\n";
		}
		
		String[] arr = text.split("\\s+");
		
		name += arr[place + 2];
		number += arr[place + 3];
		
		PrintWriter outfile = new PrintWriter("result.txt");
		String output = "Rank " + rank1 + " for boy name in " + year1 + "s was " + name + " (" + number + " births)."; 
		outfile.println(output);
		outfile.close();

		System.out.println(output);

	}
	
	public static void girlName (String year, int rank) throws FileNotFoundException {
		
		String year1 = year;
		String rank1 = "" + rank;
		String text = "";
		String name = "";
		String number = "";
		int rankline = rank - 1;
		int place = 7 + 5 * rankline;
		
		Scanner input = new Scanner (new FileReader(year1 + ".txt"));
		
		while (input.hasNextLine()) {
			text += input.nextLine() + "\n";
		}
		
		String[] arr = text.split("\\s+");
		
		name += arr[place + 4];
		number += arr[place + 5];
		
		PrintWriter outfile = new PrintWriter("result.txt");
		String output = "Rank " + rank1 + " for girl name in " + year1 + "s was " + name + " (" + number + " births)."; 
		outfile.println(output);
		outfile.close();

		System.out.println(output);

	}
	
	public static void main (String [] args) {
		
		try {
		
			for (String s : args) {
				if (! (s.equals("1980") || s.equals("1990") || s.equals("2000") || s.equals("2010"))) {
					System.out.println("No year! Please enter in 1980, 1990, 2000 or 2010.");
				}
				else {
					System.out.println("Year: " + s);
					String year = s;
		
					Scanner input = new Scanner (System.in);
		
					System.out.println("Enter rank: ");
					int rank = input.nextInt();
					
					while (rank > 200) {
						System.out.println("Please enter in a rank from 1 to 200.");
						System.out.println("Enter rank: ");
						rank = input.nextInt();
					}
					
					System.out.println("Enter gender (boy or girl): ");
					String gender = input.next();
					
					while (!(gender.equals("boy") || gender.equals("girl"))) {
						System.out.println("Please enter either boy or girl.");
						System.out.println("Enter gender (boy or girl): ");
						gender = input.next();
					}
	
					if (gender.equals("boy")) {
						boyName(year,rank);
					}
	
					else {
						girlName(year,rank);
					}	
				}
			}
		}
		
		catch (FileNotFoundException year) {
			System.out.println("No year! Please enter in 1980, 1990, 2000 or 2010");
			
		}	
	}

}