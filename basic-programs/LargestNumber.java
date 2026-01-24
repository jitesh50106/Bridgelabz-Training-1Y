import java.util.Scanner;
public class LargestNumber{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first no.=");
        int a = sc.nextInt();
        System.out.println("Enter Second no.=");
        int b = sc.nextInt();
        System.out.println("Enter Third no.=");
        int c = sc.nextInt();
        System.out.println("Is the first number the largest? " +
                (a > b && a > c ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " +
                (b > a && b > c ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " +
                (c > a && c > b ? "Yes" : "No"));
    }
} 
