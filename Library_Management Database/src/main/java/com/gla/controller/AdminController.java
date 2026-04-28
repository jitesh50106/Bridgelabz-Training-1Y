package com.gla.controller;

import com.gla.model.Book;
import com.gla.service.LibraryService;

import java.util.Scanner;

public class AdminController {

    private LibraryService service;
    private Scanner sc = new Scanner(System.in);

    public AdminController(LibraryService service) {
        this.service = service;
    }

    public void adminMenu() {

        while (true) {
            System.out.println("\n--- ADMIN PANEL ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. View Issued Details");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    service.removeBook(id);
                    break;

                case 3:
                    service.showBooks();
                    break;

                case 4:
                    service.showIssuedDetails();
                    break;

                case 5:
                    return;
            }
        }
    }

    private void addBook() {

        Book b = new Book();

        System.out.print("ID: ");
        b.setId(sc.nextInt()); sc.nextLine();

        System.out.print("Title: ");
        b.setTitle(sc.nextLine());

        System.out.print("Author: ");
        b.setAuthor(sc.nextLine());

        System.out.print("Publisher: ");
        b.setPublisher(sc.nextLine());

        System.out.print("Price: ");
        b.setPrice(sc.nextInt()); sc.nextLine();

        System.out.print("Category: ");
        b.setCategory(sc.nextLine());

        service.addBook(b);
    }
}