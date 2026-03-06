package library;

import java.util.ArrayList;

public class Library {

    static ArrayList<Book> books = new ArrayList<>();

    // Add Book
    static void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    // View Books
    static void viewBooks() {
        for(Book b : books) {
            System.out.println(
                b.bookId + " | " + b.title + " | " + b.author + " | Issued: " + b.isIssued
            );
        }
    }

    // Issue Book
    static void issueBook(int id) {

        for(Book b : books) {
            if(b.bookId == id && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued successfully!");
                return;
            }
        }

        System.out.println("Book not available.");
    }

    // Return Book
    static void returnBook(int id) {

        for(Book b : books) {
            if(b.bookId == id && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned successfully!");
                return;
            }
        }

        System.out.println("Invalid book ID.");
    }
}
