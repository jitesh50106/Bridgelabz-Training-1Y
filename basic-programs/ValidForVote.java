import java.util.Scanner;

public class ValidForVote{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the age of person:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote.");
        }
        else{
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
    }
}
