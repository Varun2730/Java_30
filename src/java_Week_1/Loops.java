package java_Week_1;
// Two types of initiallization of variabels with diffent looping statements

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }
    }
}
