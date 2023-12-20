/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static final int RANDOM_GENERATIONS = 3;

    public static void main(String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);
        int lowerBound = Math.min(numberOne, numberTwo);
        int upperBound = Math.max(numberOne, numberTwo);

        int minimalNumber = upperBound;
        for (int i = 0; i < RANDOM_GENERATIONS; i++) {
            int randomNumber = (int) Math.floor(Math.random() * (upperBound - lowerBound) + lowerBound);
            System.out.println(randomNumber);
            minimalNumber = Math.min(minimalNumber, randomNumber);
        }

        System.out.printf("The minimal generated number was %d", minimalNumber);
    }
}
