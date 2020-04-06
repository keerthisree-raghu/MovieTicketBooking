package movieticketbooking;

/**
 * Movie Information
 */

public class Movie {
	/**
	 * Required fields in the Movie class
	 */
	private int movieId;
	private String movieName;
	private String movieStatus;
	private String movieType;
	private String theaterId;
	
	/**
	 * Movie class constructor
	 * @param movieId - Unique movie ID 
	 * @param movieName - Name of the movie
	 * @param movieStatus - Availability of the movie
	 * @param movieType - Genre of the movie
	 */
	public Movie(int movieId, String movieName, String movieStatus, String movieType) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieStatus = movieStatus;
		this.movieType = movieType;
	}

	// movieId
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	// movieName
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	// movieStatus

	public String getMovieStatus() {
		return movieStatus;
	}
	public void setMovieStatus(String movieStatus) {
		this.movieStatus = movieStatus;
	}

	// movieType

	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	// theaterId

	public String getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	
}
