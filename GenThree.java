/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);
        int lowerBound = Math.min(numberOne, numberTwo);
        int upperBound = Math.max(numberOne, numberTwo);


        int randomNumberOne = (int) Math.floor(Math.random() * (upperBound - lowerBound) + lowerBound);
        System.out.println(randomNumberOne);
        int randomNumberTwo = (int) Math.floor(Math.random() * (upperBound - lowerBound) + lowerBound);
        System.out.println(randomNumberTwo);
        int randomNumberThree = (int) Math.floor(Math.random() * (upperBound - lowerBound) + lowerBound);
        System.out.println(randomNumberThree);

        int minimalNumber = Math.min(randomNumberOne, randomNumberTwo);
        minimalNumber = Math.min(minimalNumber, randomNumberThree);

        System.out.printf("The minimal generated number was %d", minimalNumber);
    }
}
