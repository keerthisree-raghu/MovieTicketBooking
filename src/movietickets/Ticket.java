package movietickets;

import java.util.*;

public abstract class Ticket {
	Scanner scan = new Scanner(System.in);
	
	// Select Movie theater
	public void selectTheater() {
		System.out.println("Choose Theater:");
		
		List<String> theaterList = new ArrayList<String>();
		theaterList.add("1. Luxe Cinemas");
		theaterList.add("2. Sathyam Cinemas");
		theaterList.add("3. PVR Cinemas");
		theaterList.add("4. S2 Theyagaraja");
		theaterList.add("5. Kumaran Theater");
		for(int i = 0; i < theaterList.size(); i++) {
			System.out.println(theaterList.get(i));
		}
		
		// Get user's theater choice
		int theaterChoice = scan.nextInt();
		String theaterName = theaterList.get(theaterChoice-1);
		
		System.out.println("You have chosen " + theaterName.substring(3) + ".\n");
	}
	
	// Select Movie
	public void selectMovie() {
		System.out.println("Choose Movie:");
		
		List<String> movieList = new ArrayList<String>();
		movieList.add("1. Black Widow");
		movieList.add("2. Parasite");
		movieList.add("3. A Quiet Place 2");
		movieList.add("4. Mulan");
		movieList.add("5. Artemis Fowl");
		movieList.add("6. Dolittle");
		movieList.add("7. Birds of Prey");
		movieList.add("8. No Time to Die");
		movieList.add("9. Legally Blonde 3");
		movieList.add("10. Fast and Furious 9");
		
		for(int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
		
		// Get user's movie choice
		int movieChoice = scan.nextInt();
		String movieName = movieList.get(movieChoice-1);
		
		System.out.println("You have chosen " + movieName.substring(3) + ".\n");
	}
	
	// Abstract Method: Select Number of Seats
	public abstract void selectSeats();
	
	// Abstract Method: Generate Total Amount
	public abstract double generateTotalAmount(int numberOfSeats);
}

