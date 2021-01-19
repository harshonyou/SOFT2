package week2.practical_1;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        System.out.println("Enter A Sentance: ");
        Scanner y = new Scanner(System.in);
        String sentance = y.nextLine();
        y.close();

        String s = " "+sentance+" ";
        String whitespaced = "";
        String camelcase = "";
        String temp = "";
        String newlined = "";

        for(int i=1; i<s.length(); i++){
            char t = s.charAt(i);
            if(t!=' '){
                whitespaced+=t;
                if(s.charAt(i-1)==' '){
                    temp+=Character.toUpperCase(t);
                }else{
                    temp+=Character.toLowerCase(t);
                }
            }else{
                camelcase+=temp;
                newlined+=temp+"\n";
                temp="";
            }
        }
        System.out.println("White Spaced: "+whitespaced);
        System.out.println("\nCamel Case: "+camelcase);
        System.out.println("\nCamel New Line: \n"+newlined);
    }
}
