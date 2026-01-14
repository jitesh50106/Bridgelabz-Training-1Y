import java.util.Scanner;

public class QuotientAndRemainder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
        int quotient = num1 / num2;       
        int remainder = num1 % num2;
        System.out.println("The Quotient is "+quotient+" and Reminder is " + remainder  +" of two number "+num1+" and "+num2);
    }
}
