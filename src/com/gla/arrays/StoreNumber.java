package com.gla.arrays;
import java.util.Scanner;
public class StoreNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10]; // max 10 numbers
        double sum = 0;
        int i = 0;
        while (i < 10) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break; // stop if 0 or negative
            }
            arr[i] = num;
            i++;
        }
        System.out.println("\nNumbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
            sum += arr[j];
        }
        System.out.println("Sum = " + sum);

        sc.close();
    }
}