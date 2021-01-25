package week3.practical_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter Values: ");
        System.out.println("LIST: "+ Arrays.toString(OGsplit(y.nextLine().strip(),y.nextLine())));
        y.close();
    }

    public static String[] split(String text, String separators) {
        text = text+separators.charAt(0);
        ArrayList <String> al = new ArrayList<>();
        String temp="";
        boolean k = false;
        char ch;
        for(int i=0; i<text.length(); i++){
            ch = text.charAt(i);
            for(int j=0; j<separators.length(); j++){
                if(ch==separators.charAt(j)){
                    k=true;
                    break;
                }
            }
            if(k){
                al.add(temp);
                temp="";
            }else{
                temp+=text.charAt(i);
            }
            k=false;
        }
        return al.toArray(new String[al.size()]);
    }

    public static String[] OGsplit(String text, String separators) {
        text = text+separators.charAt(0);
        int len = text.length() - text.replace(separators, "").length();
        String[] arr = new String[len];
        String temp="";
        int k=0;
        outerloop:
        for(int i=0; i<text.length(); i++){
            for(int j=0; j<separators.length(); j++){
                if(text.charAt(i)==separators.charAt(j)){
                    arr[k++]=temp;
                    temp="";
                    continue outerloop;
                }
            }
            temp+=text.charAt(i);
        }
        return arr;
    }
}
