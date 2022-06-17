package com.StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	public static boolean insertUserToDB(User St) {
		boolean f=false;
		try {
			Connection con =ConnectionDB.createCon();
			String q="insert into Students(SNAME,SPHONE,SCITY) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,St.getUserName());
			pstmt.setString(2,St.getUserPhone());
			pstmt.setString(3,St.getUserCity());
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return f;
	}

	public static boolean deletedById(int userId) {
		boolean f=false;
		try {
			Connection con =ConnectionDB.createCon();
			String q="DELETE FROM Students WHERE Sid=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return f;
	}

	public static void getall() {
		
		try {
			Connection con =ConnectionDB.createCon();
			String q="SELECT * FROM Students";
			Statement pstmt=con.createStatement();
			ResultSet set=pstmt.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				System.out.println("Id : "+ id);
				System.out.println("User Name : "+ name);
				System.out.println("User phone Number : "+ phone);
				System.out.println("User City : "+ city);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static int UpdateUser(User St) {
		
		int i=-1;
		try {
			Connection con =ConnectionDB.createCon();
			String q="UPDATE Students set SNAME=?,SPHONE=?,SCITY=?  WHERE SID=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,St.getUserName());
			pstmt.setString(2,St.getUserPhone());
			pstmt.setString(3,St.getUserCity());
			pstmt.setInt(4,St.getSid());
			 i=pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	return i;
	}

	
}
