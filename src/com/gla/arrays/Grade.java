package com.gla.arrays;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Physics marks: ");
            int p = sc.nextInt();
            System.out.print("Chemistry marks: ");
            int c = sc.nextInt();

            System.out.print("Maths marks: ");
            int m = sc.nextInt();
            if (p < 0 || p > 100 || c < 0 || c > 100 || m < 0 || m > 100) {
                System.out.println("Marks must be between 0 and 100. Enter again.");
                i--;
                continue;
            }
            double percentage = (p + c + m) / 3.0;
            String grade;

            if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else if (percentage >= 40)
                grade = "E";
            else
                grade = "R";
            System.out.printf("Percentage: %.2f%n", percentage);
            System.out.println("Grade: " + grade);
        }
        sc.close();
    }
}
