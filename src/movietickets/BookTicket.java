package movietickets;

import java.util.Scanner;

public class BookTicket {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Get user details
		while(true) {
			// Create new user
			User user = new User();
			// Select seat type
			System.out.println("Select Seat Type:\n1. Normal\n2. Premium\n(Press 0 to Exit) ");
			int seatChoice = scan.nextInt();
			switch(seatChoice) {
			// Exit
			case 0: System.exit(1);
			// Normal Ticket
			case 1: 
				System.out.println("NORMAL TICKET\n");
				NormalTicket normal = new NormalTicket();
				normal.selectTheater();
				normal.selectMovie();
				normal.selectSeats();
				System.out.println("Thank you for booking!"
						+ "\n----------------------------\n");
				break;
			// Premium Ticket
			case 2:
				System.out.println("PREMIUM TICKET\n");
				PremiumTicket premium = new PremiumTicket();
				premium.selectTheater();
				premium.selectMovie();
				premium.selectSeats();
				System.out.println("Thank you for booking!"
						+ "\n----------------------------\n");
				break;
			default: System.out.println("Invalid Choice"); break;
			}
		}
	}
}
