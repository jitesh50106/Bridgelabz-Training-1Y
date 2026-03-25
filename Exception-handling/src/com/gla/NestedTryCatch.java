package com.gla;
import java.util.Scanner;
public class NestedTryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            try {
                int result = arr[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            sc.close();
        }
    }
}
