package net.cew.model.to;

import java.util.Date;

public class EventTO {
	int eventid;
	Date date;
	String title;
	String venue;
	String time;
	String duration;
	String description;
	String shownto;
	String addedby;
	
	public EventTO() {
		super();
	}public int getEventid() {
		return eventid;
	}
	
	/**
	 * @param eventid
	 * @param date
	 * @param title
	 * @param venue
	 * @param time
	 * @param duration
	 * @param description
	 */
	public EventTO(int eventid, Date date, String title, String venue,
			String time, String duration, String description) {
		super();
		this.eventid = eventid;
		this.date = date;
		this.title = title;
		this.venue = venue;
		this.time = time;
		this.duration = duration;
		this.description = description;
	}
	public EventTO(int eventid, Date date, String title, String venue,
			String time, String duration, String description, String shownto,
			String addedby) {
		super();
		this.eventid = eventid;
		this.date = date;
		this.title = title;
		this.venue = venue;
		this.time = time;
		this.duration = duration;
		this.description = description;
		this.shownto = shownto;
		this.addedby = addedby;
	}
	public String getAddedby() {
		return addedby;
	}
	public void setAddedby(String addedby) {
		this.addedby = addedby;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShownto() {
		return shownto;
	}
	public void setShownto(String shownto) {
		this.shownto = shownto;
	}
}
	
	