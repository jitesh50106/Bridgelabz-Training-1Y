import java.util.Scanner;
public class FirstSmallestOrNot{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first no.=");
        int a = sc.nextInt();
        System.out.println("Enter Second no.=");
        int b = sc.nextInt();
        System.out.println("Enter Third no.=");
        int c = sc.nextInt();
          if (a<b && a<c) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}