/**
 * 
 */
package Bai5;

/**
 * @author ADMIN
 *
 */
public class Image extends Gallery {
	int hight, width;
	String quality;
	/**
	 * @param src
	 * @param size
	 * @param hight
	 * @param width
	 * @param quality
	 */
	public Image(String name, int size, int hight, int width, String quality) {
		super(name, size);
		this.hight = hight;
		this.width = width;
		this.quality = quality;
	}
	

}
