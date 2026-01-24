import java.util.*;
public class CheckNumber{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the no.:");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("no. is Zero");
        }
        else if (a>0){
            System.out.println("No. is Positive");
        } 
        else{
            System.out.println("No. is Negative");
        }
    }
}
