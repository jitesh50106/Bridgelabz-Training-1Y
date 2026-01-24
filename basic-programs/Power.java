import java.util.Scanner;
public class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println("Enter the power:");
        int power = sc.nextInt();
        if(number>0){
            int p =1;
            for(int i = 1;i<=power;i++){
                p = p*number;
            }
            System.out.println("The value is : "+p);
        }
        else{
            System.out.println("Please enter a valid number.");
        }
        
    }
}
