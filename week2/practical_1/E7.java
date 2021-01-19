package week2.practical_1;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter A: ");
        String a = String.valueOf(y.nextInt());
        System.out.println("Enter B: ");
        String b = String.valueOf(y.nextInt());
        y.close();

        int shrt = a.length()<=b.length() ? a.length() : b.length();
        int big = a.length()>=b.length() ? a.length() : b.length();

        String bin = "";

        for(int i=0; i<shrt; i++){
            if(a.charAt(i)==b.charAt(i)){
                bin+='1';
            }else{
                bin+='0';
            }
        }
        if(shrt!=big){
            for(int i=0; i<(big-shrt); i++){
                bin+='0';
            }
        }

        System.out.println("Binary: "+bin);
    }
}
