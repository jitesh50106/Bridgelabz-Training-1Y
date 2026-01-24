import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = 0.0;   
        System.out.print("Enter a no.: ");
        double v = sc.nextDouble();
        while (v != 0) {
            t = t + v;
            System.out.print("Enter a no.: ");
            v = sc.nextDouble();
        }
        System.out.println("Total sum = " + t);

        sc.close();
    }
}
