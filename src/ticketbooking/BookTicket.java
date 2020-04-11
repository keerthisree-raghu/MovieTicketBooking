package ticketbooking;

import java.util.Scanner;

public class BookTicket {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// USER 1
		User user1 = new User();
	
		user1.selectTheater();
		System.out.println();
		
		user1.selectMovie();
		System.out.println();
		
		user1.selectSeats();
		System.out.println();
	
		System.out.println(user1.showDetails());;
		System.out.println();
		
		user1.makePayment();
		System.out.println();
		
		// USER 2
		User user2 = new User();
		
		user2.selectTheater();
		System.out.println();
		
		user2.selectMovie();
		System.out.println();
		
		user2.selectSeats();
		System.out.println();
	
		System.out.println(user2.showDetails());;
		System.out.println();
		
		user2.makePayment();
		System.out.println();
	}

}
