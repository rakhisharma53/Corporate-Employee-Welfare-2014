package net.cew.model.to;

import java.util.Date;

public class BulletinTO {
	int eventid;
	Date date;
	String bulletin;
	public BulletinTO(int eventid, Date date, String bulletin) {
		super();
		this.eventid = eventid;
		this.date = date;
		this.bulletin = bulletin;
	}
	public BulletinTO() {
		super();
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBulletin() {
		return bulletin;
	}
	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}
	
}
