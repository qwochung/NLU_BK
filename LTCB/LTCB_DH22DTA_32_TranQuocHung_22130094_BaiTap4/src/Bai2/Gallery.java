/**
 * 
 */
package Bai2;

/**
 * Develop a program that creates a gallery from three
different kinds of records: images (gif), texts (txt), and
sounds (mp3). All have names for source files and sizes
(number of bytes). Images also include information about
the height, the width, and the quality of the image. Texts
specify the number of lines needed for visual
representation. Sounds include information about the
playing time of the recording, given in seconds.

 * @author ADMIN
 *	Example :
 *
 *		-an image, stored in flower.gif; size: 57,234 bytes; width:100 pixels; height: 50 pixels; quality: medium;

		-a text, stored in welcome.txt; size: 5,312 bytes; 830 lines;

		-a music piece, stored in theme.mp3; size: 40960 bytes,
		playing time 3 minutes and 20 seconds.
 *
 
 *
 */
public abstract class Gallery {
	String src;
	int size;
	/**
	 * @param src : source of object
	 * @param size : number of bytes
	 */
	public Gallery(String src, int size) {
		super();
		this.src = src;
		this.size = size;
	}
	

}
