import java.util.Scanner;

public class ConvertToYardAndMile{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter distance in feet: ");
        double df = sc.nextDouble();
        double dy = df / 3;
        double dm = dy / 1760;
        System.out.println("Distance in yards = " + dy);
        System.out.println("Distance in miles = " + dm);
    }
}
