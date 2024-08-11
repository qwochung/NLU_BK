/**
 * 
 */
package Bai5;

/**
 * @author ADMIN
 *
 */
public class Sound extends Gallery{
	int playTime;

	/**
	 * @param src
	 * @param size
	 * @param playTime
	 */
	public Sound(String name, int size, int playTime) {
		super(name, size);
		this.playTime = playTime;
	}

}
