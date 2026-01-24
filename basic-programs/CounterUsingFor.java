import java.util.Scanner;
public class CounterUsingFor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the countdown number:");
        int c = sc.nextInt();
        for(int i =c;i>=1;i--){
            System.out.println(i);
        }
    }
}
