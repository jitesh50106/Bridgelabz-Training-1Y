import java.util.Scanner;
public class CounterUsingWhile{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the countdown number:");
        int c = sc.nextInt();
        while(c>=1){
            System.out.println(c);
            c--;
        }
    }
}
