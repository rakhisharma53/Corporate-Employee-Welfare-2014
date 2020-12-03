package net.cew.model.to;

public class AdminTO
{
	String username;
	String name;
	String password;
	String usertype;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public AdminTO(String username, String name, String password,
			String usertype) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.usertype = usertype;
	}
	

}
