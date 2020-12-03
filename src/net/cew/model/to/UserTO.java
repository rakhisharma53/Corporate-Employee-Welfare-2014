package net.cew.model.to;

public class UserTO
{
    String ut;
    String un;
    String up;
	public String getUt() {
		return ut;
	}
	public void setUt(String ut) {
		this.ut = ut;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getUp() {
		return up;
	}
	public void setUp(String up) {
		this.up = up;
	}
	public UserTO(String ut, String un, String up) {
		super();
		this.ut = ut;
		this.un = un;
		this.up = up;
	}
    
}
