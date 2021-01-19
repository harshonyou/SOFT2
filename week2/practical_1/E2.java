package week2.practical_1;

import java.util.Scanner;

public class E2 {
    public static void main(String [] args){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter The Amount of Banana: ");
        double amount = y.nextFloat();
        double total;
        if(amount>50.0){
            total=amount*3.0+(4.99-1.50);
        }else{
            total=amount*3.0+(4.99);
        }
        System.out.println("The Total Amount: £"+total);
        y.close();
    }
}
