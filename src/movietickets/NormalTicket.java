package movietickets;

public class NormalTicket extends Ticket {
	private static int totalNumberOfSeats = 100;
	private int numberOfSeats;
	private double totalAmount = 0.00;

	@Override
	public void selectSeats() {
		// TODO Auto-generated method stub
		System.out.println("Number of Seats:");
		numberOfSeats = scan.nextInt();
		
		totalNumberOfSeats -= numberOfSeats;
		
		if(totalNumberOfSeats == 0) {
			System.out.println("Sorry, seats full.");
		}
		else {
			System.out.println("You have selected " + numberOfSeats +
					(numberOfSeats > 1 || numberOfSeats == 0? " normal seats.\n" : " seat.\n"));
			// Generate bill based on the number of seats selected
			System.out.println("Total = " + generateTotalAmount(numberOfSeats));
			System.out.println("\n" + totalNumberOfSeats + " normal seats are left.\n");
		}
	}

	@Override
	public double generateTotalAmount(int numberOfSeats) {
		// TODO Auto-generated method stub
		totalAmount = numberOfSeats * 120;
		return totalAmount;
	}
}
