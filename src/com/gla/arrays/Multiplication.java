package com.gla.arrays;
import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] arr = new int[4];
        int j = 0;
        for (int i = 6; i <= 9; i++) {
            arr[j] = number * i;
            j++;
        }
        int k =0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + arr[k]);
            k++;
        }
    }
}
