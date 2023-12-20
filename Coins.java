/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
    public static final int CENTS_IN_QUARTER = 25;

    public static void main(String[] args) {
        int totalCents = Integer.parseInt(args[0]);
        int remainedCents = totalCents % CENTS_IN_QUARTER;
        int quarters = (totalCents - remainedCents) / CENTS_IN_QUARTER;
        System.out.printf("Use %d quarters and %d cents", quarters, remainedCents);
    }
}