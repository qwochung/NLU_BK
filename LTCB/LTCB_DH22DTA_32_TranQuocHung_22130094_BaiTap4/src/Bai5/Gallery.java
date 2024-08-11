/**
 * 
 */
package Bai5;

/**
 * Develop a program that creates a gallery from three different kinds of records: images (gif), texts (txt), and sounds (mp3). 

	All have names for source files and sizes (number of bytes).
 	Images also include information about the height, the width, and the quality of the image.
  	Texts specify the number of lines needed for visual representation. 
  	Sounds include information about the playing time of the recording, given in seconds. 
 * @author ADMIN
 *
 */
public abstract class  Gallery {
	
	String name;
	int size;

	/**
	 * @param name
	 * @param size
	 */
	public Gallery(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}





	
	
	
	
	/**
	 * Develop the following methods for this program: timeToDownload
	 *  which computes how long it takes to download a file at some network connection speed,
	 * typically given in bytes per second; 
	 */
	
	
	public double timeToDownload()
	{
		return this.size;
	}
	
	
	
	
	
	/**
	 * smallerThan, which determines whether the file is smaller than
some given maximum size that can be mailed as an
attachment;

	 */

	
	
	public boolean smallerThan (int maximumSize) {
		return this.size <= maximumSize;
		
	}
	
	
	
	
	/**
	 * sameName, which determines whether the name of a file is the
same as some given name.
	 */
	
	

	public boolean sameName (String name) {
		return this.name.equals(name);
	}
	
	
	
	
	
	
	
	
	
	
	

}
