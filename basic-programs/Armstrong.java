import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int o = n;
        int s = 0;
        int temp = n;
        int d = 0;
        while (temp != 0) {
            d++;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0){
            int digit = temp % 10;
            s += Math.pow(digit, d); 
            temp = temp / 10;
        }
        if (s == o){
            System.out.println("It is an Armstrong number");
        } else{
            System.out.println("It is not an Armstrong number");
        }
    }
}
