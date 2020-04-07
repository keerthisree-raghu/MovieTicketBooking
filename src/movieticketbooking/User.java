package movieticketbooking;

/**
 * User Information
 */

public class User {
	/**
	 * Required fields in the User class
	 */
	private int userId;
	private String name;
	private String mobileNumber;
	private String emailId;
	
	/**
	 * User class constructor 
	 * @param userId - Unique ID of the user
	 * @param name - Name of the user
	 * @param mobileNumber - Mobile number of the user
	 * @param emailId - Email ID of the user
	 */
	public User(int userId, String name, String mobileNumber, String emailId) {
		this.userId = userId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	// userId
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	// name
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// mobileNumber
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	// emailId
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}