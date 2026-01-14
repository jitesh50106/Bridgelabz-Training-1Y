import java.util.Scanner;

public class Square{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the length:");
        int l = sc.nextInt();
        int p = 4*l;
        System.out.println("The length of the side is  "+l+" whose perimeter is "+p);
    }
}
