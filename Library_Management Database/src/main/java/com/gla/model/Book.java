package com.gla.model;

public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private String category;
    private boolean issued;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean isIssued() { return issued; }
    public void setIssued(boolean issued) { this.issued = issued; }
}