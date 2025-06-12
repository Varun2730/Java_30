package java_Week_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllExceptions {

    public static <Excep> void main(String[] args) {

        // 1. Handling ArithmeticException (Division by zero)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }

        // 2. NullPointerException (accessing a method or field on a null object)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception!");
        }

        // 3. ArrayIndexOutOfBoundsException (accessing invalid array index)
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }

        // 4. InputMismatchException (user input type mismatch)
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();  // If input is not an integer, this will throw InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer number!");
        }

        // 5. NumberFormatException (invalid string to number conversion)
        try {
            String str = "abc";
            int num = Integer.parseInt(str);  // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (pection  e) {  // Catching the general Exception class
            System.out.println("Caught an exception: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}

