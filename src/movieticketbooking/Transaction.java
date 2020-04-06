package movieticketbooking;

/**
 * Transaction to Book Tickets
 */

public class Transaction {
	/**
	 * Required fields for Transaction class
	 */
	private int userId;
	private float billAmount;
	private float amountPaid;
	private String bookingStatus;
	
	/**
	 * Transaction class constructor
	 * @param userId - Unique ID of the user
	 * @param billAmount - Bill amount generated
	 */
	public Transaction(int userId, float billAmount) {
		amountPaid = 0;
		bookingStatus = "Not Booked";
		this.userId = userId;
		this.billAmount = billAmount;
	}

	// userId
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	// billAmount

	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	
	// amountPaid

	public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	// bookingStatus
	
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
}
