package java_Week_1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( n == 1 || n == 2 ) {
            System.out.println("prime");
        }
        if (n % 2 == 0) {
            System.out.println("not prime");
        }
            else {
            System.out.println(n + " is prime");
        }


        }
    }

