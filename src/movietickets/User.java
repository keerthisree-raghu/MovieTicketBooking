package movietickets;

import java.util.Scanner;

public class User {
	private String name;
	private String mobileNumber;
	private String emailId;
	private int userId;
	private static int id = 1;

	Scanner scan = new Scanner(System.in);
	
	// Constructor: Prompts user to enter the required details
	public User() {
		getUserDetails();
		System.out.println("\nHello, " + name + "!\n");
	}
	
	// User Details
	private void getUserDetails() {
		System.out.println("Name:");
		this.name = scan.nextLine();
		
		System.out.println("Mobile Number:");
		this.mobileNumber = scan.nextLine();
		
		System.out.println("Email ID:");
		this.emailId = scan.nextLine(); 
		
		setUserId();
		
		System.out.println();
		System.out.println("User ID: " + userId);
	}

	// Generate User ID
	private void setUserId() {
		this.userId = id++;
	}
	
	// Get and Set Methods for Mobile Number and Email ID
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
