/**
 * 
 */
package Bai2;

/**
 * @author ADMIN
 *
 */
public class Sound extends Gallery {
	int playTime;

	/**
	 * @param src
	 * @param size
	 * @param playTime
	 */
	public Sound(String src, int size, int playTime) {
		super(src, size);
		this.playTime = playTime;
	}

}
