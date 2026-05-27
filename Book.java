public class Book {

    
    private String title;
    private String author;
    private boolean borrowed;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    
    public void borrowBook() {
        borrowed = true;
    }

    
    public void returnBook() {
        borrowed = false;
    }

    
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
