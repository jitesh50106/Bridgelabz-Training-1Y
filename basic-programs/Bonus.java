import java.util.Scanner;
public class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a salary of employee:");
        int s = sc.nextInt();
        System.out.println("Enter a year of service of employee:");
        int y = sc.nextInt();
        double a = 0.0;
        if(y>5){
             a = s*5/100;            
        }
        System.out.println("The bonus amount is "+a);

    }
}
