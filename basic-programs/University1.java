import java.util.Scanner;
public class University1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the university fee : ");
        int fee = sc.nextInt();
        System.out.println("Enter the university fee discount: ");
        int discountPercentage = sc.nextInt();
        int discount = (fee*discountPercentage)/100;
        int discountfee = fee - discount;
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " + discountfee);
    }
}
