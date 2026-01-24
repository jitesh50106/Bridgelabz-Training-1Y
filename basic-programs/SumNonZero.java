import java.util.Scanner;
public class SumNonZero{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double v;
        double t = 0.0;
        do {
            System.out.println("Enter a no.: ");
            v = sc.nextDouble();
            if (v<=0){
                break;   
            }
            t = t + v;
        } 
        while (v>0);
        System.out.println("Total sum = " + t);
    }
}
