package com.gla;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Book> library = new HashMap<>();

        library.put(101, new TextBook(101, "Java Programming", 450));
        library.put(102, new TextBook(102, "Data Structures", 500));
        library.put(201, new Magazine(201, "Science Today", 120));
        library.put(202, new Magazine(202, "Tech Monthly", 150));

        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();

        if (library.containsKey(id)) {

            Book b = library.get(id);

            System.out.println("\nBook Found:");
            b.display();

            System.out.print("Enter days late: ");
            int days = sc.nextInt();

            System.out.println("Fine: ₹" + b.calculateFine(days));

        } else {
            System.out.println("Book not found.");
        }

        sc.close();
    }
}