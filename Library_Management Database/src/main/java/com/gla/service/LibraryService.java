package com.gla.service;

import com.gla.model.Book;
import com.gla.repository.*;

public class LibraryService {

    private BookRepository bookRepo = new BookRepository();
    private UserRepository userRepo = new UserRepository();
    private IssueRepository issueRepo = new IssueRepository();

    public void showBooks() {
        bookRepo.getAllBooks().forEach(b ->
                System.out.println(
                        b.getId() + " | " +
                                b.getTitle() + " | " +
                                (b.isIssued() ? "Issued" : "Available")
                ));
    }

    public void addBook(Book b) {
        bookRepo.addBook(b);
    }

    public void removeBook(int id) {
        bookRepo.removeBook(id);
    }

    public void issueBook(String name, String email, int bookId) {

        Book book = bookRepo.findById(bookId);

        if (book == null) {
            System.out.println("❌ Book not found");
            return;
        }

        if (book.isIssued()) {
            System.out.println("❌ Book already issued");
            return;
        }

        var user = userRepo.findByEmail(email);
        int studentId;

        if (user == null) {
            studentId = userRepo.saveStudent(name, email);
        } else {
            studentId = user.getId();
        }

        issueRepo.issueBook(bookId, studentId);
        bookRepo.updateIssued(bookId, true);

        System.out.println("✅ Book issued to " + name);
    }

    public void returnBook(String email, int bookId) {

        var user = userRepo.findByEmail(email);

        if (user == null) {
            System.out.println("❌ Student not found");
            return;
        }

        issueRepo.returnBook(bookId, user.getId());
        bookRepo.updateIssued(bookId, false);

        System.out.println("✅ Book returned");
    }

    // 🔥 ADMIN
    public void showIssuedDetails() {
        issueRepo.getAllIssuedDetails();
    }

    // 🔥 STUDENT
    public void showMyBooks(String email) {
        issueRepo.getBooksByStudent(email);
    }
}