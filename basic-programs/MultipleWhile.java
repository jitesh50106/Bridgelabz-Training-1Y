import java.util.Scanner;
public class MultipleWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int i =100;       
            while(i>1){
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } 
        else {
            System.out.println("Please enter a valid number.");
        }
    }
}
