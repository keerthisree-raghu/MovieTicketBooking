package ticketbooking;

import java.util.*;

public class Movie extends Bill {
	private String theaterName;
	private String movieName;
	private int numberOfSeats;
	
	Scanner scan = new Scanner(System.in);
	private int totalNumberOfSeats = 300;
	
	// Selecting Movie Theater
	public void selectTheater() {
		System.out.println("Choose Theater:");
		
		List<String> theaterList = new ArrayList<String>();
		theaterList.add("1. Luxe Cinemas");
		theaterList.add("2. Sathyam Cinemas");
		theaterList.add("3. PVR Cinemas");
		for(int i = 0; i < theaterList.size(); i++) {
			System.out.println(theaterList.get(i));
		}
		
		// Ask the user for their choice of theater
		int theaterChoice = scan.nextInt();
		theaterName = theaterList.get(theaterChoice-1);
		
		System.out.println("You have chosen " + theaterName.substring(3) + ".");
	}
	
	
	// Selecting Movie
	public void selectMovie() {
		System.out.println("Choose Movie:");
		List<String> movieList = new ArrayList<String>();
		movieList.add("1. Black Widow");
		movieList.add("2. Parasite");
		movieList.add("3. A Quiet Place");
		movieList.add("4. Mulan");
		movieList.add("5. Artemis Fowl");
		
		for(int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
		
		// Ask the user for their choice
		int movieChoice = scan.nextInt();
		movieName = movieList.get(movieChoice-1);
		
		System.out.println("You have chosen " + movieName.substring(3) + ".");
	}
	
	public void selectSeats() {		
		System.out.println("Number of Seats:");
		numberOfSeats = scan.nextInt();
		
		totalNumberOfSeats -= numberOfSeats;
		
		if(totalNumberOfSeats == 0) {
			System.out.println("Sorry, seats full.");
		}
		else {
			System.out.println("You have selected " + numberOfSeats +
					(numberOfSeats > 1 || numberOfSeats == 0? " seats." : " seat."));
			System.out.println();
			generateBill(numberOfSeats);
			
			System.out.println();
			System.out.println(totalNumberOfSeats + " seats are left.");
		}		
	}
	
	// To access attributes in parent class
	public String getTheaterName() {
		return theaterName;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
}