package week3.practical_2;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner y = new Scanner (System.in);
        System.out.println("Enter The Value: ");
        int base10 = toBase10(y.next());
        y.close();
        System.out.println(base10);
    }
    public static int toBase10(String binary) {

        int sum=0;
        for(int i=binary.length()-1, j=0; i>=0; i--, j++){
            if(binary.charAt(i)=='1'){
                sum+=Math.pow(2, j);
            }
        }
        return sum;
    }
}
