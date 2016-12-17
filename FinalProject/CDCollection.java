// Yedoh Kang
// Accelerated Java 
// FINAL PROJECT

import java.io.*;

public class CDCollection {
	
	private CD[] collection; // CD collection array of CD objects
	private double totalCost; // total cost
	private int _size; // # of CDs /  # of meaningful elements in the array
	private int _lastPos; // last position of meaningful element
	
	public CDCollection() {
		collection = new CD[100];
		totalCost = 0;
		_size = 0;
		_lastPos = -1;
	}
	
	public void addCD (String title, String artist, double cost, int tracks) {
		
		// create new CD
		CD one = new CD (title, artist, cost, tracks);
			
		// place in order
		
		// find index (where it belongs)
		int index = 0;
		while (collection[index] != null && one.getArtist().compareTo(collection[index].getArtist()) > 0) {
			index += 1;
		}

		// insert!
		// go from right to left
		for (int x = _size; x >= index; x -= 1){
			collection[x + 1] = collection[x];
		}
		
		collection[index] = one; // insert
		
		if (_lastPos >= index) {
			_lastPos += 1; // bc every existing element shifts one to the right
		}
		else {
			_lastPos = index; // _lastPos will be index if _lastPos is less than index
		}
			
		_size += 1; // update size
		totalCost += one.getCost(); // update total cost
	}
	
	public void removeCD (String title){

		// find index where title of song is
		int index = 0;
		while (collection[index].getTitle().equals(title) == false)  {
			index += 1;
		}
			
		// subtract cost
		totalCost -= collection[index].getCost();
		
		// remove!
		for (int x = index + 1; x < collection.length; x++) {
			collection[x -1] = collection[x]; // shift everything after the index left
		}
	
		_lastPos -= 1; // update last meaningful position
		_size -= 1; // update size
	
	}
	
	public String toString() {
		
		String retStr = "";
		double avgCost = 0;
			
		avgCost = totalCost / _size;

		retStr += "\nTotal # of CDs: " + _size + "\n";
		retStr += "Total Cost: " + totalCost + "\n";
		retStr += "Average Cost: " + avgCost + "\n";
		retStr += "\nList of CDs (Alphabetically by Artist): " + "\n";
		
		int i = 0;
		while (i < _size && collection[i] != null) {
			retStr += collection[i].toString() + "\n\n";
			i+= 1;
		}
		
		return retStr;
	}

}





