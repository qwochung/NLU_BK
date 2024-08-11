package Cau2;

public class Sculpture extends ArtObject {
	String materialFrom;
	int height, weight;
	public Sculpture(String title,String artist,  int year, String materialFrom, int height, int weight) {
		super(artist, title, year);
		this.materialFrom = materialFrom;
		this.height = height;
		this.weight = weight;
	}
	public String getMaterialFrom() {
		return materialFrom;
	}
	public void setMaterialFrom(String materialFrom) {
		this.materialFrom = materialFrom;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Sculpture : " + title + ", " + artist +  ", " + year + materialFrom + ", " + height  + ", " + weight	;
	}
	@Override
	public int compareTo(ArtObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
