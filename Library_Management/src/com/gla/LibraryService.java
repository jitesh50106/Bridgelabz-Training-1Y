package com.gla;

import java.util.List;

public class LibraryService {

    private LibraryRepository repository;

    public LibraryService(LibraryRepository repository) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.addBook(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    public Boolean issueBook(int bookId) {
        Book book = repository.findBookById(bookId);

        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            return true;
        }
        return false;
    }

    public Boolean returnBook(int bookId) {
        Book book = repository.findBookById(bookId);

        if (book != null && book.isIssued()) {
            book.setIssued(false);
            return true;
        }
        return false;
    }

    public Boolean removeBook(int id) {
        return repository.removeBook(id);
    }
}