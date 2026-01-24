import java.util.Scanner;
public class DivisibleBy5{
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no.=");
       
        int a = sc.nextInt();
        if (a%5== 0) {
            System.out.println("Is the number " + a + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + a + " divisible by 5? No");
        }
    }
}
