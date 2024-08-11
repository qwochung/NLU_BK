package bai3;

public class image {
	int width; // in pixels
	int height; // in pixels
	String source; // file name
	String quality; // informal
	
	public image(int width, int height, String source, String quality) {
		super();
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
	}


	/**
	 *  isPortrait, which determines whether the image’s height is larger than its width;
	 *  example :
	 *  	new image(10, 20, "src ", "FHD").isPortrait() => True
	 *  	new image(111110, 20, "src ", "FHD").isPortrait() => False
	 */
	
	public boolean isPortrait () {
		return this.height > this.width ;
	}
	
	
	/**
	 * size, which computes how many pixels the image contains
	 * example :
	 * 		assertEquals(new image(12, 10, "src", "4k").size(), 120); => True
	 * 		assertEquals(new image(12, 10, "src", "4k").size(), 1200) => False
	 * 	
	 */
	
	public int size() {
		return this.height * this.width;
		
	}
	
	
	/**
	 * isLarger, which determines whether one image contains more pixels than some other image
	 * example :
	 * 	assertTrue(new image(1244, 120, "src","2k").isLarger(new image(12, 20, "src", "FHD"))) => True
	 */
	public boolean isLarger ( image image2) {
		return  this.height * this.width > image2.height * image2.width           ;
		
	}
	
	
	/**
	 * same, which determines whether this image is the same as a given one
	 * @param image2 : name of another image
	 * @return 
	 * example :
	 * 		ssertTrue(new image(11, 10, "src", "FHD").same(new image(11, 10, "src", "FHD"))) => True
	 * 
	 * 
	 */
	
	public boolean same(image image2) {
		return 
				this.height == image2.height  
				&& this.width == image2.width
				&& this.source == image2.source
				&& this.quality == image2.quality;
		
	}
	
/**
 * sizeString produces one of three strings, depending on the number of pixels in the image:
		"small" for images with 10,000 pixels or fewer;
		"medium" for images with between 10,001 and 1,000,000 pixels;
		"large" for images that are even larger than that.
	* 
	* example:
	* 	assertEquals(new image(1000,10000,"src","4k").sizeString(), "large"); => True
	* 
	* 
	* 

 */
	
	public String sizeString() {
		if (this.size()  <= 10000 )
			return "small";
		
			
		if (this.size() <= 1000000)
			return "average";
		
		else return "large";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
