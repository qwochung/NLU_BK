/**
 * 
 */
package Bai2;

/**
 * @author ADMIN
 *
 */
public class Image extends Gallery {
	int hight, width;
	/**
	 * @param src
	 * @param size
	 * @param hight
	 * @param width
	 * @param quality
	 */
	public Image(String src, int size, int hight, int width, String quality) {
		super(src, size);
		this.hight = hight;
		this.width = width;
		this.quality = quality;
	}
	String quality;

}
