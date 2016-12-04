// Yedoh Kang
// Accelerated Java 
// Lab 4


public class CD implements Comparable<CD> {
	
	private String title;
	private String artist;
	private double cost;
	private int numberOfTracks;
	
	public CD (String title1, String artist1, double cost1, int numberOfTracks1) {
		title = title1;
		artist = artist1;
		cost = cost1;
		numberOfTracks = numberOfTracks1;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public double getCost () {
		return cost;
	}
	
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	
	public int compareTo (CD c) {
		int compare = artist.compareTo(c.getArtist());
		return compare;
	}
	
	public String toString() {
		String retStr = "";
		retStr += "Title: " + getTitle() + "\tArtist: " + getArtist() + "\tCost: " + getCost() + "\tNumber of Tracks: " + getNumberOfTracks();
		return retStr;
	}
	
	//public static void main (String[] args) {
	//	CD hello = new CD ("hello", "Adele", 24, 2);
	//	System.out.println(hello);
	//}
	
}