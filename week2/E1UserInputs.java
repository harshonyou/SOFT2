package week2;

import java.util.Scanner;

public class E1_UserInputs {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a int: ");
        int number = keyboard.nextInt();
        System.out.println("Number Entered: "+number);
        keyboard.close();
    }
}
