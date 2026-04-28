package com.gla.controller;

import com.gla.service.LibraryService;
import java.util.Scanner;

public class StudentController {

    private LibraryService service;
    private Scanner sc = new Scanner(System.in);

    public StudentController(LibraryService service) {
        this.service = service;
    }

    public void studentMenu() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        while (true) {

            System.out.println("\n--- STUDENT PANEL ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. My Books");
            System.out.println("5. Back");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.showBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    service.issueBook(name, email, id);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int rid = sc.nextInt();
                    service.returnBook(email, rid);
                    break;

                case 4:
                    service.showMyBooks(email);
                    break;

                case 5:
                    return;
            }
        }
    }
}