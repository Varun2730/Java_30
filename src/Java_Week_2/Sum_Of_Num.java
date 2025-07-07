package Java_Week_2;

import java.util.Scanner;

public class Sum_Of_Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int inum = sc.nextInt();
        System.out.print("Enter a ending number: ");
        int iend = sc.nextInt();
        int temp = 0;

       while(inum<=iend)
       {
           temp = inum+ temp;
           inum++;
//           System.out.println(temp);

       }
        System.out.println(temp);
    }
}
