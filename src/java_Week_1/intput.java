package java_Week_1;
import java.util.Scanner;

//package java_Week_1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Reverse_Array_sort1 {
//
//
//
//    public static void main(String[] args) {
//
//       // find if  a character exists in string
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String check = sc.nextLine();
//
//
//        if(str.contains(check)){
//            System.out.println(" Same");
//                    System.out.println("your text is "  +check +" present in "+ str);
//        }
//
//    }
//
//
//
//public Boolean  intergerlenght {
//        Integer[] arr = new Integer[4];
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//
//
//    }
//
//}
//
//
public class intput {
    public static void main(String[] args) {

        int[][] myNumbers = new int[3][3];
        Scanner sc= new Scanner(System.in);


        for (int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length;j++) {
                myNumbers[i][j]=sc.nextInt();

            }
        }
        for (int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length;j++) {
                System.out.println( + myNumbers[i][j]);


            }
        }

    }
}
