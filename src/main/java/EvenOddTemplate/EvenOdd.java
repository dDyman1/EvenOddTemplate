package EvenOddTemplate;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        // TODO: Accept user input using a Scanner
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            boolean even = EvenOdd.isEven(n);
            if (even) {
                System.out.println(n + " is an even number.");
            } else {
                System.out.println(n + " is an odd number.");
            }
        }
    }

    public static boolean isEven(int number) {
        // TODO: Determine whether or not the number is even
        return number%2 == 0;
    }

}