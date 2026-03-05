package com.gla;

class Book {

    private int bookId;
    private String title;
    private double price;

    static String libraryName = "City Central Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }

    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}