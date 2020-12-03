package net.cew.model.to;

import java.util.Date;

public class EmployeeTO {
	String e_id;
	String name;
	String f_name;
	Date dob;
	long mobileno;
	String emailid;
	String line1;
	String line2;
	String city;
	String state;
	int pincode;
	String username;
    String password;
    String usertype;
    byte[] pic;
    String bg;
    
    public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	
	/**
	 * @param e_id
	 * @param name
	 * @param f_name
	 * @param dob
	 * @param mobileno
	 * @param emailid
	 * @param line1
	 * @param line2
	 * @param city
	 * @param state
	 * @param pincode
	 * @param username
	 * @param password
	 * @param usertype
	 * @param pic
	 * @param bg
	 */
	public EmployeeTO(String e_id, String name, String f_name, Date dob,
			long mobileno, String emailid, String line1, String line2,
			String city, String state, int pincode, String username,
			String password, String usertype, byte[] pic, String bg) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.f_name = f_name;
		this.dob = dob;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.pic = pic;
		this.bg = bg;
	}
	public EmployeeTO(String e_id, String name, String f_name, Date dob,
			long mobileno, String emailid, String line1, String line2,
			String city, String state, int pincode, String username,
			String password, String usertype, byte[] pic, String bg,
			String department) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.f_name = f_name;
		this.dob = dob;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.pic = pic;
		this.bg = bg;
		this.department = department;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	String department;
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeTO(String e_id, String name, String f_name, Date dob,
			long mobileno, String emailid, String line1, String line2,
			String city, String state, int pincode, String username,
			String password,String department) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.f_name = f_name;
		this.dob = dob;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
	}
	public EmployeeTO() {
		super();
	}
    
}
