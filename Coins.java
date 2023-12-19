/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int totalCents = Integer.parseInt(args[0]);
		int remainedCents = totalCents % 25;
		int quarters = (totalCents - remainedCents) / 25;
		System.out.printf("Use " + quarters + " quarters and " + remainedCents +  " cents");
	}
}