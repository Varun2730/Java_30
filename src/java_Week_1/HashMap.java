package java_Week_1;


public class HashMap {
    public static void main(String[] args) {
        
        java.util.HashMap<Integer, String> students = new java.util.HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        System.out.println("Student with ID 1: " + students.get(1));
        System.out.println("Student with ID 2: " + students.get(2));

        if (students.containsKey(3)) {
            System.out.println("Student with ID 3 exists: " + students.get(3));
        }

        System.out.println("\nAll Students:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }
    }
}
