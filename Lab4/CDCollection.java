// Yedoh Kang
// Accelerated Java 
// Lab 4

import java.io.*;

public class CDCollection {
	
	private CD[] collection;
	private int count;
	private double totalCost;
	private CD[] newcollection;
	
	public CDCollection() {
		collection = new CD[5];
		newcollection = new CD[5];
		count += 1;
	}
	
	public void addCD (String title, String artist, double cost, int tracks) {
		// create new CD
		CD one = new CD (title, artist, cost, tracks);
		// place in order
		int i = 0;
		while (newcollection[i] != null && one.getArtist().compareTo(newcollection[i].getArtist()) > 0) {
			i += 1;
		}

		// make a copy until the new CD
		int y = 0;
		while (y < i) {
			collection[y] = newcollection[y];
			y += 1;
		} 
		
		collection[i] = one;
		
		for (int x = i + 1; x < newcollection.length; x++) {
			collection[x] = newcollection[x];
		}
		
		count += 1;
	}
	
	//public void removeCD (String title) {
		
		
		//}
	public String toString() {
		String retStr = "";
		int i = 0;
		int numCD = 0;
		double totalCost = 0;
		double avgCost = 0;
		
		while (i < count && collection[i] != null) {
			i += 1;
			numCD += 1;
			totalCost += collection[i].getCost();
		}
		
		avgCost = totalCost / numCD;
		
		retStr += "Total # of CDs: " + numCD + "\n";
		retStr += "Total Cost: " + totalCost + "\n";
		retStr += "Average Cost: " + avgCost + "\n";
		retStr += "List of CDs: " + "\n";
		
		i = 0;
		while (i < count && collection[i] != null) {
			retStr += collection[i].toString() + "\n";
			i+= 1;
		}
		
		return retStr;
	}

}





