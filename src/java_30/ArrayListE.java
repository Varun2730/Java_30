package java_30;

import java.util.ArrayList;

public class ArrayListE {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Element at index 2: " + numbers.get(2));

        numbers.remove(1);

        System.out.println("\nArrayList after removal:");
        for (int num : numbers) {

            System.out.println(num);
        }
    }
}
