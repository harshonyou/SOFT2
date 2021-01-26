package week3.practical_2;

import java.util.Arrays;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter number of variables: ");
        int len = y.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            System.out.println("Enter Element: ");
            arr[i]=y.nextInt();
        }
        System.out.println("Enter number of divisions: ");
        System.out.println(Arrays.deepToString(rasterise(arr, y.nextInt())));
        y.close();
    }
    public static int[][] rasterise(int[] data, int width){
        int len = data.length;
        if(len%width !=0 ){
            return null;
        }
        int row = len/width;
        int[][] arr = new int[row][width];
        int k=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<width; j++){
                arr[i][j]=data[k++];
            }
        }
        return arr;
    }
}
