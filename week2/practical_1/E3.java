package week2.practical_1;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args){

        Scanner y = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = y.nextInt();
        System.out.println("Enter Rate: ");
        double rate = y.nextDouble();
        y.close();

        double m = 208-0.7*age;

        if(rate<0.5*m){
            System.out.println("Couch potato");
        }else if(rate<0.7*m){
            System.out.println("Aerobic training");
        }else if(rate<0.9*m){
            System.out.println("Threshold training");
        }else{
            System.out.println("Interval training");
        }
    }
}
