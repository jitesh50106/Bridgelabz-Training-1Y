import java.util.Scanner;

public class Double{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c = sc.nextDouble();
        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;
        System.out.println("The results of Int Operations are "+ r1 + ", " + r2 + ", "+ r3 + ", " + r4);
    }
}
