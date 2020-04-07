package movieticketbooking;

/**
 * Theater Information
 */

import java.util.*;

public class Theater {
	/**
	 * Required fields for Theater class
	 */
	private int theaterId;
	private String theaterName;
	private String location;
	private List<String> movies;
	
	/**
	 * Theater class constructor
	 * @param theaterId - Unique ID of each theater
	 * @param theaterName - Name of the theater
	 * @param location - Location or address of theater
	 * @param movies - Movies currently showing at the theater
	 */
	public Theater(int theaterId, String theaterName) {
		this.theaterId = theaterId;
		this.theaterName = theaterName;
	}
	
	// theaterId

	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	// theaterName

	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	// location

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	// movies
	
	public List<String> getMovies() {
		return movies;
	}
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
	
}
