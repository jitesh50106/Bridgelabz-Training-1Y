import java.util.Scanner;;
public class FactorialUsingWhile{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no.:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("No. is negative");
        } else {
            long f = 1; 
            int i = 1;
            while (i <= n) {
                f = f * i;
                i++;
            }
        System.out.println("The factorial is "+f);
        }
    }
}
