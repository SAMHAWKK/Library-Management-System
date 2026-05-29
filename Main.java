import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create demo books
        Book book1 = new Book("Java Basics", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Johnson");
        Book book3 = new Book("Algorithms", "Bob Lee");

        // Store them in a list
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Display books
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        // You can add the menu logic here if you like
    }
}
