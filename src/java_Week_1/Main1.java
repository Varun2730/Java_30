package java_Week_1;

public class Main1 {
    public static void main(String[] args) {

        GenericBox<Integer> intBox = new GenericBox<>(10);
        intBox.displayItem();

        GenericBox<String> strBox = new GenericBox<>("Hello, Generics!");
        strBox.displayItem();

        intBox.setItem(20);
        System.out.println("After updating:");
        intBox.displayItem();
        strBox.displayItem();
        strBox.setItem("Hello, update!");
        System.out.println("After updating string:");
        strBox.displayItem();

    }
}

