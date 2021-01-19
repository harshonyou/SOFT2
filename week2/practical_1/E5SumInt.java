package week2.practical_1;

import java.util.Scanner;

public class E5SumInt {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int sum=0;
        int temp=0;
        while(true){
            System.out.println("Enter an Int: ");
            temp = y.nextInt();
            if(temp==0){
                break;
            }
            sum+=temp;
        }
        y.close();
        System.out.println("Sum: "+sum);
    }
}
