package net.cew.model.to;

public class DonorTO {
	private String donorid;
	private String name;
	private long contactno;
	private String bloodgroup;
	private String usertype;
	public String getDonorid() {
		return donorid;
	}
	public void setDonorid(String donorid) {
		this.donorid = donorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public DonorTO(String donorid, String name, long contactno,
			String bloodgroup, String usertype) {
		super();
		this.donorid = donorid;
		this.name = name;
		this.contactno = contactno;
		this.bloodgroup = bloodgroup;
		this.usertype = usertype;
	}
	public DonorTO() {
		super();
	}
	
}