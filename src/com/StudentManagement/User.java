package com.StudentManagement;

public class User {

	private int Sid;
	private String  UserName;
	private String UserPhone;
	private String  UserCity;
	
	public User(String userName, String userPhone, String userCity) {
		super();
		UserName = userName;
		UserPhone = userPhone;
		UserCity = userCity;
	}
	
	public User(int sid, String userName, String userPhone, String userCity) {
		super();
		Sid = sid;
		UserName = userName;
		UserPhone = userPhone;
		UserCity = userCity;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public String getUserCity() {
		return UserCity;
	}
	public void setUserCity(String userCity) {
		UserCity = userCity;
	}
	@Override
	public String toString() {
		return "User [Sid=" + Sid + ", UserName=" + UserName + ", UserPhone=" + UserPhone + ", UserCity=" + UserCity
				+ "]";
	}
	
}
