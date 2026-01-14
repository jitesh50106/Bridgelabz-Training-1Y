import java.util.Scanner;

public class Amount{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the prize of one unit :");
        int u = sc.nextInt();
        System.out.println("Enter the quantity :");
        int q = sc.nextInt();
        int t = u*q;
        System.out.println("The total purchase price is INR "+t+" if the quantity "+q+" and unit price is INR "+u);
    }
}
