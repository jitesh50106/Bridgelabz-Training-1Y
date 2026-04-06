package com.gla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        LibraryService libraryService = new LibraryService(library.getLibraryRepository());

        AdminService adminService = new AdminService(libraryService);
        StudentService studentService = new StudentService(libraryService);

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
                System.out.println("1. Admin");
                System.out.println("2. Student");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        adminMenu(sc, adminService);
                        break;

                    case 2:
                        studentMenu(sc, studentService);
                        break;

                    case 3:
                        System.out.println("Exiting system...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println(" Invalid input! Please enter numbers only.");
                sc.nextLine();
            }
        }
    }


    public static void adminMenu(Scanner sc, AdminService adminService) {

        while (true) {
            try {
                System.out.println("\n--- ADMIN MENU ---");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. View Books");
                System.out.println("4. Back");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter Publisher: ");
                        String publisher = sc.nextLine();

                        System.out.print("Enter Price: ");
                        int price = sc.nextInt();

                        System.out.println("Select Category:");
                        for (Category c : Category.values()) {
                            System.out.println(c);
                        }

                        Category category = Category.valueOf(sc.next().toUpperCase());

                        Book book = new Book(id, title, author, publisher, price, category);
                        adminService.addBook(book);
                        break;

                    case 2:
                        System.out.print("Enter Book ID to remove: ");
                        int removeId = sc.nextInt();
                        adminService.removeBook(removeId);
                        break;

                    case 3:
                        adminService.viewBooks();
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid category! Please choose from list.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Try again.");
                sc.nextLine();
            }
        }
    }

    public static void studentMenu(Scanner sc, StudentService studentService) {

        while (true) {
            try {
                System.out.println("\n--- STUDENT MENU ---");
                System.out.println("1. View Books");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("4. Back");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        studentService.viewBooks();
                        break;

                    case 2:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();
                        studentService.issueBook(issueId);
                        break;

                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        int returnId = sc.nextInt();
                        studentService.returnBook(returnId);
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Enter correct number.");
                sc.nextLine();
            }
        }
    }
}