package net.cew.model.to;

import java.util.Date;

public class LeaveTO
{
private int leaveid;
private String username;
private Date from;
private Date to;
private int days;
private String reason;
private String status;
private String usertype;
private String name; 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsertype() {
	return usertype;
}
public void setUsertype(String usertype) {
	this.usertype = usertype;
}
public LeaveTO(int leaveid, String username, Date from, Date to, int days,
		String reason, String status) {
	super();
	this.leaveid = leaveid;
	this.username = username;
	this.from = from;
	this.to = to;
	this.days = days;
	this.reason = reason;
	this.status = status;
}
public LeaveTO() {
	super();
}
public int getLeaveid() {
	return leaveid;
}
public void setLeaveid(int leaveid) {
	this.leaveid = leaveid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getFrom() {
	return from;
}
public void setFrom(Date from) {
	this.from = from;
}
public Date getTo() {
	return to;
}
public void setTo(Date to) {
	this.to = to;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
