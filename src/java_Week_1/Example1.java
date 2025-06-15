package java_Week_1;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("PavanGF.txt");
        }
        catch (ArithmeticException e) {

            System.out.println("Error: File not found!");
            // e.printStackTrace();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("FInallly is excuted");
        }





    }
}
