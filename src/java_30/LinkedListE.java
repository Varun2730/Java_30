package java_30;

import java.util.LinkedList;

public class LinkedListE {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("\nLinkedList after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
