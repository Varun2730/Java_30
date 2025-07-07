package Java_Week_2;

import java.util.Scanner;

public class Reverse_Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        int  s = sc.nextInt();
        int temp =0;
        int ans =0;


        while(s >0){
            temp  = s%10;
            ans = ans*10+temp;
            s = s/ 10;

        }
        System.out.print(ans);    }
}
