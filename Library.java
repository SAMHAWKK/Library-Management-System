import java.util.ArrayList;

public class Library {

    
    private ArrayList<Book> books;

    
    public Library() {
        books = new ArrayList<>();
    }

   
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully.");
    }

   
    public void displayBooks() {

        System.out.println("\n===== Library Books =====");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

   
    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    
    public void searchBook(int index) {

        if (index >= 0 && index < books.size()) {
            books.get(index).displayBook();
        } else {
            System.out.println("Invalid index.");
        }
    }

    
    public void borrowBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You borrowed: " + title);
                } else {
                    System.out.println("Book already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    
    public void returnBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You returned: " + title);
                } else {
                    System.out.println("Book was not borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}
