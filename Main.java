import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Library Object
        Library library = new Library();

        // Add Sample Books
        library.addBook(new Book("Java Basics", "John Smith"));
        library.addBook(new Book("OOP Concepts", "Alice Brown"));
        library.addBook(new Book("Data Structures", "Michael Lee"));

        // Polymorphism
        Person student = new Student("Samuel", 101);
        Person teacher = new Teacher("Mr. David", 201);

        // Display roles
        System.out.println("\n===== Library Members =====");
        System.out.println(student.getName());
        student.displayRole();

        System.out.println();

        System.out.println(teacher.getName());
        teacher.displayRole();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    library.displayBooks();
                    break;

                case 2:

                    System.out.print("Enter book title: ");
                    String searchTitle = input.nextLine();

                    library.searchBook(searchTitle);
                    break;

                case 3:

                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = input.nextLine();

                    library.borrowBook(borrowTitle);
                    break;

                case 4:

                    System.out.print("Enter book title to return: ");
                    String returnTitle = input.nextLine();

                    library.returnBook(returnTitle);
                    break;

                case 5:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}          
