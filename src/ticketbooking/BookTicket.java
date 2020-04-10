package ticketbooking;

import java.util.Scanner;

public class BookTicket extends Movie {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User();
	
		user1.selectTheater();
		System.out.println();
		
		user1.selectMovie();
		System.out.println();
		
		user1.selectSeats();
		System.out.println();
		
		System.out.println(user1.toString());;
		System.out.println();
		
		user1.makePayment();
		System.out.println();
		
	}

}
