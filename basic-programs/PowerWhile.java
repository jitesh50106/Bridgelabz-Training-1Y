import java.util.Scanner;
public class PowerWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("Enter the power:");
        int power = sc.nextInt();
        if(number>0){
            int p =1;
            int i =1;
            while(i<=power){
                p = p*number;
                i++;
            }
            System.out.println("The value is : "+p);
        }
        else{
            System.out.println("Please enter a valid number.");
        }
        
    }
}
