package com.gla;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {

    private List<Book> bookList = new ArrayList<>();
    public void addBook(Book book) {
        bookList.add(book);
    }
    public List<Book> getAllBooks() {
        return bookList;
    }
    public Book findBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    public boolean removeBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            bookList.remove(book);
            return true;
        }
        return false;
    }
}