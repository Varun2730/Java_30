package Java_Week_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Java_date {

    public static void main(String[] args) {
        // Get current date
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the LocalDate using DateTimeFormatter
        String formattedDate = localDate.format(dateFormat);

        // Print the formatted date
        System.out.println("Formatted date: " + formattedDate);
    }
}
