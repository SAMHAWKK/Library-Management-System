public class Book {

    // Encapsulation
    private String title;
    private String author;
    private boolean borrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    // Borrow book
    public void borrowBook() {
        borrowed = true;
    }

    // Return book
    public void returnBook() {
        borrowed = false;
    }

    // Display book info
    public void displayBook() {

        String status;

        if (borrowed) {
            status = "Borrowed";
        } else {
            status = "Available";
        }

        System.out.println(
                "Title: " + title +
                " | Author: " + author +
                " | Status: " + status
        );
    }
}
