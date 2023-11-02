/*using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number 
to Result variable*/

package Assignment1;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        String result = number >= 0 ? "Positive number" : "Negative number";
        System.out.println(result);
    }
}
