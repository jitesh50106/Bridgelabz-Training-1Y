import java.util.Scanner;
public class Harshad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int o = number; 
        int sum = 0; 
        while (number != 0) {
            int digit = number % 10; 
            sum += digit;             
            number = number / 10;     
        }
        if (o % sum == 0) {
            System.out.println( "It is a Harshad Number");
        } else {
            System.out.println("It is not a Harshad Number");
        }
    }
}
