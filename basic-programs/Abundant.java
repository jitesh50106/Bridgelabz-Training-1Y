import java.util.Scanner;
public class Abundant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int s =0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        if(s>n){
            System.out.println("It is a Abundant Number");
        }
        else{
            System.out.println("It is not a Abundant Number");
        }
    }   
}

