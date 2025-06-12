package java_30;

public class MethodCalling {

    public static int add(int a, int b) {

        return a + b;
    }

    public static double add(double a, double b) {

        return a + b;
    }

    public static void printMessage(String message) {

        System.out.println(message);
    }

    public static void checkNumber(int number) {

        if (number > 0) {

            System.out.println(number + " is positive.");
        } else if (number < 0) {

            System.out.println(number + " is negative.");
        } else {

            System.out.println(number + " is zero.");
        }
    }

    public static void main(String[] args) {

        int Sum_I = add(5, 10);
        System.out.println("Sum of integers: " + Sum_I);

        double SumDouble = add(5.5, 10.5);
        System.out.println("Sum of doubles: " + SumDouble);

        printMessage("Hello, this is a message!");

        checkNumber(7);
        checkNumber(-3);
        checkNumber(0);
    }
}

