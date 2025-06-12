package java_Week_1;

public class GenericBox<T> {

    public T item;
    public GenericBox(T item) {

        this.item = item;
    }

    public T getItem() {

        return item;
    }

    public void setItem(T item) {

        this.item = item;
    }

    public void displayItem() {

        System.out.println("Item: " + item );
    }
}
