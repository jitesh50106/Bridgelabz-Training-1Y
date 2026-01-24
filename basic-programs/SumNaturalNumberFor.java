import java.util.Scanner;
public class SumNaturalNumberFor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int s=(n*(n+1))/2;
        int s_f = 0;
        for(int i=0;i<=n;i++){
            s_f=s_f+i;
        }
        if(s==s_f){
            System.out.println("The both result is same and result is "+s);
        }
        else{
            System.out.println("The result is not same.");
        }
    }
}
