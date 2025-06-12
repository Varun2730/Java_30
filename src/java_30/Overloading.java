package java_30;



public class Overloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));

        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));

        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
    }
}

