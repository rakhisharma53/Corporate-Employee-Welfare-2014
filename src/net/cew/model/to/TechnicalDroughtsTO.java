package net.cew.model.to;

import java.util.Date;

public class TechnicalDroughtsTO {
	 int technicaldrought_id;
	   String username;
	   String name;
	 //  String department;
	   String type;
	   String comment;
	   Date date;
	   byte[] pic;
	   
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public TechnicalDroughtsTO(int technicaldrought_id, String username,
			String name, String type, String comment, Date date, byte[] pic) {
		super();
		this.technicaldrought_id = technicaldrought_id;
		this.username = username;
		this.name = name;
		this.type = type;
		this.comment = comment;
		this.date = date;
		this.pic = pic;
	}
	public TechnicalDroughtsTO(int technicaldrought_id, String username,
			String name, String type, String comment, Date date) {
		super();
		this.technicaldrought_id = technicaldrought_id;
		this.username = username;
		this.name = name;
		this.type = type;
		this.comment = comment;
		this.date = date;
	}
	public TechnicalDroughtsTO() {
		super();
	}
	public int getTechnicaldrought_id() {
		return technicaldrought_id;
	}
	public void setTechnicaldrought_id(int technicaldrought_id) {
		this.technicaldrought_id = technicaldrought_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
