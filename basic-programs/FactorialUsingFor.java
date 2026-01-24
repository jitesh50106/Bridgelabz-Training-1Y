import java.util.Scanner;;
public class FactorialUsingFor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no.:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("No. is negative");
        } else {
            long f = 1; 
            for(int i = 1;i<=n;i++){
                f=f*i;
            }
        System.out.println("The factorial is "+f);
        }
    }
}
