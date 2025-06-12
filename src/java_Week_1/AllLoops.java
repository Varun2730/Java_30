package java_Week_1;

public class AllLoops {
    public static void main(String[] args) {

        // for--for--for--for--for--for--
        for (int i = 1; i <= 5; i++) {
            System.out.println("Using for loop:"+ i);
        }

        // while-- while--while--while--while--while--
        int j = 1;
        while (j <= 5) {
            System.out.println(" Using while loop:"+ j);
            j++;
        }

        // do-while--do-while--do-while--do-while--do-while--do-while--
        int k = 1;
        do {
            System.out.println(" Using do-while loop:"+ k);
            k++;
        } while (k <= 5);

        // for-each--for-each--for-each--for-each--for-each--
        System.out.println();
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(" Using for-each loop:"+ num);
        }
    }
}
