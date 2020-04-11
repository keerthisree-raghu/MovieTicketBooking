package ticketbooking;

import java.util.*;

public class Bill {
	Scanner scan = new Scanner(System.in);
	private double billAmount = 0.00;
	private double amountPaid = 0.00;
	
	// Generate bill based on number of seats selected
	public void generateBill(int seats) {
		billAmount = seats * 120;
		System.out.println("Total Amount = Rs. " + billAmount);
	}
	
	// Make Payment
	public void makePayment() {
		System.out.println("Enter amount to pay:");
		amountPaid = scan.nextDouble();
		validatePayment(amountPaid);
	}

	// Validate Payment
	public void validatePayment(double amountPaid) {
		if(amountPaid == billAmount) {
			System.out.println("\nYour booking was successful.\nThank you for booking!");
		}
		else {
			System.out.println("\nYour booking was unsuccessful.");
		}
	}
	
	public double getBillAmount() {
		return billAmount;
	}
}
