import java.util.Scanner;

public class AreaOfTriangle{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in centimeters: ");
        double cm = sc.nextDouble();
        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your height in feet is " + feet + " and inches is " + inches);
    }
}
