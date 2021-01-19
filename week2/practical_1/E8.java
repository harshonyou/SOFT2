package week2.practical_1;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter Rows of the Floyd's Triangle: ");
        int x = y.nextInt();
        y.close();
        int n=0;
        for(int i=1; i<=x; i++){
            if(i%2==0){
                n=1;
            }else{
                n=0;
            }
            for(int j=1; j<=i; j++){
                if(n==1){
                    n=0;
                }else{
                    n=1;
                }
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
