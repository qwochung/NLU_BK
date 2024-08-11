package Cau2;

import java.util.ArrayList;

public abstract class ArtObject implements Comparable<ArtObject>  {
	String artist , title ;
	int year ;
	static ArrayList< Painting > list  ;
	
	public ArtObject(String artist, String title, int year) {
		super();
		this.artist = artist;
		this.title = title;
		this.year = year;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
	public static ArrayList<Painting > createPaintingList () {
		list = new ArrayList<>()	;
		ArtObject p1 = new Painting("The Annunciation", "Leonardo Da Vinci", 1473, "sơn dầu", "hiện đại");
		ArtObject p2 = new Painting("The Baptism of Christ", "Leonardo Da Vinci", 1476, "sơn dầu", "cổ điển");
		ArtObject p3 = new Painting("Madonna of the Carnation", "Leonardo Da Vinci", 1475, "sơn dầu", "hiện đại");
		ArtObject p4 = new Painting("Text of the original cherry", "Vincent Vangogh", 0, "sơn dầu", "cổ điển");
		ArtObject p5 = new Painting("Botero beat oil painting", "Botero", 0, "sơn dầu", "cổ điển");
		
		
		
		list.add((Painting) p1);
		list.add((Painting) p2);
		list.add((Painting) p3);
		list.add((Painting) p4);
		list.add((Painting) p5);
		return list;
	}
	@Override
	public abstract String toString() ;
	
	
	
	public static void main(String[] args) {
		System.out.println(createPaintingList().toString());
	}
	
	
	
	
	
	
	
	
	
	
}
