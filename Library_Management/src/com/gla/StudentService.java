package com.gla;

import java.util.List;

public class StudentService {

    private LibraryService libraryService;

    public StudentService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void viewBooks() {
        List<Book> books = libraryService.getAllBooks();

        for (Book b : books) {
            System.out.println(
                    b.getId() + " | " +
                            b.getTitle() + " | " +
                            (b.isIssued() ? "Issued" : "Available")
            );
        }
    }

    public void issueBook(int id) {
        if (libraryService.issueBook(id)) {
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(int id) {
        if (libraryService.returnBook(id)) {
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Error returning book");
        }
    }
}