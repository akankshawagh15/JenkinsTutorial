/*wap  that ask two numbers from user and print greater number among two */

package Assignment1;

import java.util.Scanner;

public class GreaterAmongTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = num1 > num2 ? num1 : num2;
        System.out.println("Greater number: " + result);
    }
}
