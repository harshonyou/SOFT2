package week2.practical_1;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args){

        Scanner y = new Scanner(System.in);
        System.out.println("Enter The First Side: ");
        int a = y.nextInt();
        System.out.println("Enter The Second Side: ");
        int b = y.nextInt();
        System.out.println("Enter The Third Side: ");
        int c = y.nextInt();
        y.close();

        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the Triangle: "+area);
    }
}
