package week3.practical_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class E2TextUtils {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter Values: ");
        System.out.println("LIST: "+ Arrays.toString(OGsplit(y.nextLine().strip()+" ")));
        y.close();
    }
    public static String[] split(String text) {
        ArrayList <String> al = new ArrayList<>();
        String temp="";
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==' '){
                al.add(temp);
                temp="";
            }else{
                temp+=text.charAt(i);
            }
        }
        return al.toArray(new String[al.size()]);
    }
    public static String[] OGsplit(String text) {
        int len = text.length() - text.replace(" ", "").length();
        String[] arr = new String[len];
        String temp="";
        int j=0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==' '){
                arr[j++]=temp;
                temp="";
            }else{
                temp+=text.charAt(i);
            }
        }
        return arr;
    }
}
