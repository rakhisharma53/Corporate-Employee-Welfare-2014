package net.cew.model.to;

public class ImageTO
{
   byte[] pic;

/**
 * @param pic
 */
public ImageTO(byte[] pic) {
	super();
	this.pic = pic;
}

public byte[] getPic() {
	return pic;
}

public void setPic(byte[] pic) {
	this.pic = pic;
}
   
}
