package Java_Week_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Return_Any_Day_Inbuilt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        int inum = input.nextInt();

        if (inum >= 0 && inum <= 6) {
            LocalDate date = LocalDate.ofYearDay(2025,inum);
            DayOfWeek day = date.getDayOfWeek();

            System.out.println("The day of the week is: " + day);
        }
        else {
            System.out.println("Invalid input! Please enter a number between 0 and 6.");
        }
    }
}
