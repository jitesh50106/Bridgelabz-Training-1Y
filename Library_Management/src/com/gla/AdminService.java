package com.gla;

import java.util.List;

public class AdminService {

    private LibraryService libraryService;

    public AdminService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void addBook(Book book) {
        libraryService.addBook(book);
    }

    public void removeBook(int id) {
        if (libraryService.removeBook(id)) {
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found");
        }
    }

    public void viewBooks() {
        List<Book> books = libraryService.getAllBooks();

        for (Book b : books) {
            System.out.println(
                    b.getId() + " | " +
                            b.getTitle() + " | " +
                            b.getAuthor() + " | " +
                            (b.isIssued() ? "Issued" : "Available")
            );
        }
    }
}