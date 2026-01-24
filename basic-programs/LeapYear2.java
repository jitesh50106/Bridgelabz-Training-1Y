import java.util.Scanner;
public class LeapYear2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        int a = sc.nextInt();
        if (a >= 1582) {
            if (a % 400 == 0) {
                System.out.println("Leap year");
            }
            else if (a % 100 == 0) {
                System.out.println("Not leap year");
            }
            else if (a % 4 == 0) {
                System.out.println("Leap year");
            }
            else {
                System.out.println("Not leap year");
            }
        }
        else {
            System.out.println("The input year is less than 1582 in Gregorian Calendar");
        }
    }
}
