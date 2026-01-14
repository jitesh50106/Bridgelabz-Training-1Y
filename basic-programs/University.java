public class University{
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercentage = 10;
        int discount = (fee*discountPercentage)/100;
        int discountfee = fee - discount;
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR " + discountfee);
    }
}
