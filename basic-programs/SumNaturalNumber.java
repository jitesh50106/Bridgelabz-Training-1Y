import java.util.Scanner;
public class SumNaturalNumber{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Limit:");
        int n = sc.nextInt();
        if(n>=0){
            int k = (n*(n+1))/2;
            System.out.println("The sum of "+n+" natural numbers is "+k);
        }
        else{
            System.out.println("The number "+n+"is not a natural number");
        }
    }
}
