Library Management System

This is a console-based Library Management System in Java that applies core OOP concepts. It uses classes such as Person, Student, Teacher, Book, and Library to demonstrate encapsulation, inheritance, and polymorphism, showing a step-by-step progression of OOP principles.

Description

This project is a console-based Java application that demonstrates the following OOP concepts:

Classes and Objects
Encapsulation
Inheritance
Polymorphism

The application allows users to:

Display books
Search for books
Borrow books
Return books



Files
Main.java
Person.java
Student.java
Teacher.java
Book.java
Library.java



OOP Concepts Used
1. Classes and Objects (V1.0 & V2.0)

All files demonstrate class creation and object instantiation. For example, in Main.java (lines 11-16), we create instances such as students, teachers, and books.

2. Encapsulation (V1.0 & V2.0)

Encapsulation is used with private fields. In Person.java (lines 4-5), we declare private fields like name and id. Getters and setters, such as getName() (lines 11-12) and setName() (lines 15-16), ensure controlled access.

3. Inheritance (V3.0)

The Student (lines 1-7) and Teacher (lines 1-7) classes inherit from the Person class. Both override the displayRole() method (in Student and Teacher) to specify their unique roles.

4. Polymorphism (V4.0)

Runtime polymorphism is demonstrated in Main.java (lines 17-18), where we assign a Person reference to different subclasses (e.g., Person student = new Student(...)). Method overriding (displayRole()) dynamically resolves based on the instance. Method overloading is shown in Library.java (lines 38-53), where we define two searchBook() methods: one that searches by title and another by index.

By following these instructions and reviewing the code, you will see how each OOP principle is implemented and how they work together in this system.

How to Compile and Run

To compile and run this project, follow these steps:

Ensure you have the Java Development Kit (JDK) installed (version 11 or higher).
Open a terminal in the project directory where the .java files are located.
Compile all Java files with:javac *.java
Run the program by executing:java Main
