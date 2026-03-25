package com.gla;
import java.util.Scanner;
public class ArrayException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            if (n > 0) {
                arr = new int[n];
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }
            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
        }
    }
}
