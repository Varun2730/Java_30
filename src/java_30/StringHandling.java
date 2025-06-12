package java_30;

public class StringHandling {

    public static void main(String[] args) {

        String str = "Hello, Java!";

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        int length = str.length();
        System.out.println("Length: " + length);

        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        String subStr = str.substring(7, 11);
        System.out.println("Substring: " + subStr);
    }
}
