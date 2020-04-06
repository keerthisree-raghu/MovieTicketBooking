package movieticketbooking;

/**
 * Booking Seats at the Theater
 */

public class BookSeats {
	/**
	 * Required fields for BookSeats class
	 */
	private int userId;
	private int theaterId;
	private int movieId;
	private int numberOfSeats;
	private String seatType;
	private float billAmount;
	
	/**
	 * BookSeats class constructor
	 * @param userId - Unique ID of the user
	 * @param theaterId - Unique ID of the selected theater
	 * @param movieId - Unique ID of the selected movie
	 * @param seats - Number of seats to be booked
	 * @param seatType - Type of seats (Normal, Premium)
	 */
	public BookSeats(int userId, int theaterId, int movieId, int seats, String seatType) {
		billAmount = 0;
		this.userId = userId;
		this.theaterId = theaterId;
		this.movieId = movieId;
		this.numberOfSeats = seats;
		this.seatType = seatType;
	}

	// userId
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	// theaterId
	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	// movieId

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	// numberOfSeats
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	// seatType

	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	// billAmount
	
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	
}
