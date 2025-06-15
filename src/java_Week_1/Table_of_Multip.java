package java_Week_1;

import java.util.Scanner;

public class Table_of_Multip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int inum = sc.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println( inum + " X "+ i +" = "+ inum*i);

        }


    }
}
