package Java_Week_2;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Program {
    public static void main(String[] args) {

        double amount =160000.55;

        NumberFormat formatterIn = NumberFormat.getCurrencyInstance(new Locale("yen","JAP"));
        System.out.println("Current amount is "+formatterIn.format(amount));
    }
}


