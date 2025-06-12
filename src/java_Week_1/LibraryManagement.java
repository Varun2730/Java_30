package java_Week_1;//

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed. Please return it first.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book( "Java Programming", "Author A");
        Book book2 = new Book("C Programming", "Author B");

        book1.display();
        book2.display();

        book1.borrowBook();
        book2.borrowBook();
        book1.returnBook();
        book2.borrowBook();
    }
}
