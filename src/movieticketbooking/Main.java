package movieticketbooking;

import java.util.*;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// USER INFORMATION:
		
		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.println("Mobile Number: ");
		String mob_no = scan.nextLine();
		System.out.println("Email ID: ");
		String email = scan.nextLine();
		
		// Create user object
		User user = new User(1, name, mob_no, email);
		System.out.println();
		System.out.println("Hello, " + user.getName() + "!");
		
		// THEATER INFORMATION:
		
		System.out.println("Choose Theater: ");
		
		// Create and print list of available theaters
		List<String> theaterList = new ArrayList<String>();
		theaterList.add("1. Luxe Cinemas");
		theaterList.add("2. Sathyam Cinemas");
		theaterList.add("3. PVR Cinemas");
		for(int i = 0; i < theaterList.size(); i++) {
			System.out.println(theaterList.get(i));
		}
		
		// Ask the user for their choice of theater
		int theaterChoice = scan.nextInt();
		String theaterName = theaterList.get(theaterChoice-1);

		Theater theater = new Theater(101, theaterName);
		
		// Print the name of the chosen theater
		System.out.println("You have chosen " + theater.getTheaterName().substring(3));
		System.out.println();

		// MOVIES:
		
		// Create and print list of movies
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
		String movieName = movieList.get(movieChoice-1);
		
		// Print chosen movie
		System.out.println("You have chosen " + movieName.substring(3) + " at " + theater.getTheaterName().substring(3));
		System.out.println();
		
		// BOOKING
		
		// Selecting seats
		System.out.println("Number of Seats: ");
		int seats = scan.nextInt();
		System.out.println("Seat Type: ");
		String seatType = scan.nextLine();
		
		// Create BookSeats object
		
		BookSeats booking = new BookSeats(1, 101, 12, seats, seatType);
		System.out.println();
		System.out.println("You have booked " + booking.getSeatType() + booking.getNumberOfSeats() + 
				(booking.getNumberOfSeats()>1 || booking.getNumberOfSeats() == 0? " seats" : " seat"));
			
	}
	
}
