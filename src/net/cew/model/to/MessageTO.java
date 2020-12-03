package net.cew.model.to;

import java.util.Date;

public class MessageTO {
	int msgid;
	Date date;
	String messagetitle;
	String messagedescription;
	String sender;
	String reciever;
	boolean msgstatus;
	public MessageTO(int msgid, Date date, String messagetitle,
			String messagedescription, String sender, String reciever,
			boolean msgstatus) {
		super();
		this.msgid = msgid;
		this.date = date;
		this.messagetitle = messagetitle;
		this.messagedescription = messagedescription;
		this.sender = sender;
		this.reciever = reciever;
		this.msgstatus = msgstatus;
	}
	public MessageTO() {
		super();
	}
	public int getMsgid() {
		return msgid;
	}
	public void setMsgid(int msgid) {
		this.msgid = msgid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessagetitle() {
		return messagetitle;
	}
	public void setMessagetitle(String messagetitle) {
		this.messagetitle = messagetitle;
	}
	public String getMessagedescription() {
		return messagedescription;
	}
	public void setMessagedescription(String messagedescription) {
		this.messagedescription = messagedescription;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public boolean isMsgstatus() {
		return msgstatus;
	}
	public void setMsgstatus(boolean msgstatus) {
		this.msgstatus = msgstatus;
	}
	
	
}
