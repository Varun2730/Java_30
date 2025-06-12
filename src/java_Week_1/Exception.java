package java_Week_1;

public class Exception  {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;
        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero!");
        }
        System.out.println("Program continues......");
    }
}
