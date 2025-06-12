package java_30;

import java.util.*;


public class Listof_Veggies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> veggies = new ArrayList<>();

        System.out.println("Enter the number of vegetables you want to input:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the veg:");
        for (int i = 0; i < n; i++) {
            String vegetable = scanner.nextLine();
            veggies.add(vegetable);
        }

        System.out.println("\nList with duplicates: " + veggies);

        Set<String> uniqueVegetables = new HashSet<>(veggies);

        System.out.println("removing dupli: " + uniqueVegetables);

        scanner.close();
    }
}
