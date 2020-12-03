package net.cew.model.to;

public class CareerTO 
{
	int sno;
	String uploads;
	String description;
	String filename;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @param sno
	 * @param uploads
	 * @param description
	 * @param filename
	 */
	public CareerTO(int sno, String uploads, String description, String filename) {
		super();
		this.sno = sno;
		this.uploads = uploads;
		this.description = description;
		this.filename = filename;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getUploads() {
		return uploads;
	}
	public void setUploads(String uploads) {
		this.uploads = uploads;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
