package com.StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {

	public static void main(String[] args)throws IOException{
		System.out.println("welcome User");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println(" Press 1 to ADD User");
			System.out.println("Press 2 to Delete User");
			System.out.println("Press 3 to display  User");
			System.out.println("Press 4 to  update User");
			System.out.println("Press 5 to  exit app");
			int choice=Integer.parseInt(br.readLine());
			if(choice==1) {
				//add user 
				System.out.println("Enter User Name");
				String name=br.readLine();
				System.out.println("Enter phone Number");
				String phone=br.readLine();
				System.out.println("Enter City Name");
				String city=br.readLine();
				
				User ur=new User(name,phone,city);
				boolean ans=UserDao.insertUserToDB(ur);
				if(ans) {
					System.out.println("Add user Successfully");
					System.out.println("------------------------------------------------------------------------------------------");
				}else {
					System.out.println("Something went Wrong");
					System.out.println("------------------------------------------------------------------------------------------");
				}
				
			}else if(choice==2){
				// delete user
				System.out.println("Enter User UserId which Deleted");
				int UserId=Integer.parseInt(br.readLine());
				boolean ans=UserDao.deletedById(UserId);
				if(ans) {
					System.out.println("Delete user Successfully");
					System.out.println("------------------------------------------------------------------------------------------");
				}else {
					System.out.println("Something went Wrong");
					System.out.println("------------------------------------------------------------------------------------------");
				}
				
			}else if(choice==3){
				// display
				UserDao.getall();
				System.out.println("------------------------------------------------------------------------------------------");
				
			}else if(choice==4){
				// update data 
				System.out.println("Enter User Name");
				String name=br.readLine();
				System.out.println("Enter phone Number");
				String phone=br.readLine();
				System.out.println("Enter City Name");
				String city=br.readLine();
				System.out.println("Enter User UserId which Updated");
				int UserId=Integer.parseInt(br.readLine());
				User ur=new User(UserId,name,phone,city);
				int ans=UserDao.UpdateUser(ur);
				//System.out.println(ans);
				if(ans!=-1) {
					System.out.println("Udated user Successfully");
					System.out.println("------------------------------------------------------------------------------------------");
				}else{
					System.out.println("Something went Wrong");
					System.out.println("------------------------------------------------------------------------------------------");
				}
			}else if(choice==5){
				//exit
				break;
			}else {
				
			}
		}
		System.out.println("thank you using my application");
		System.out.println("thank you!!");
		
	}

}
