import java.util.Scanner;

public class OddOrEven{
    public static void main(String[] args){
        System.out.println("Enter the limit of no.:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.println("The number "+i+" is even.");                      
                }
                else{
                    System.out.println("The number "+i+" is odd.");
                }
            }
        }
        else{
            System.out.println("The user input is not natural no.");
        } 
    }
}
