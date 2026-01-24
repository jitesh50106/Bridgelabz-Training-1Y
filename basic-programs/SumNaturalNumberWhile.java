import java.util.Scanner;
public class SumNaturalNumberWhile{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int s=(n*(n+1))/2;
        int s_w = 0;
        int i =0;
        while (i<=n){
            s_w = s_w + i;
            i++;
        }
        if(s==s_w){
            System.out.println("The both result is same and result is "+s);
        }
        else{
            System.out.println("The result is not same.");
        }
    }
}
