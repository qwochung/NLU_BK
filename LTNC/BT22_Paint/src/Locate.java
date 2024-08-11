import java.awt.Color;

public class Locate {

	int starX , starY , endX, endY , shapeType;
	Color color;
	boolean isFill;

	public Locate(int starX, int starY, int endX, int endY, int shapeType, Color color, boolean isFill) {
		super();
		this.starX = starX;
		this.starY = starY;
		this.endX = endX;
		this.endY = endY;
		this.shapeType = shapeType;
		this.color = color;
		this.isFill = isFill;
	}

	public boolean isFill() {
		return isFill;
	}

	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getStarX() {
		return starX;
	}

	public void setStarX(int starX) {
		this.starX = starX;
	}

	public int getStarY() {
		return starY;
	}

	public void setStarY(int starY) {
		this.starY = starY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	public int getShapeType() {
		return shapeType;
	}

	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}
	
}
