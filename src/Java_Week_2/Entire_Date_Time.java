package Java_Week_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entire_Date_Time {
    public static void main(String[] args) {

        LocalDateTime datetime = LocalDateTime.now();
        // LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm:ss a");
        String formattedDateTime  = datetime.format(formatter);
        System.out.println("Formatted datetime: " + formattedDateTime);
    }
}
