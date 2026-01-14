import java.util.Scanner;

public class Handshake{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no. of student : ");
        int n = sc.nextInt();
        int p = (n * (n - 1)) / 2;
        System.out.println("The no. of possible Handshake is "+p+" if no. of student is "+n);
    }
}