package week3;

import java.util.Arrays;
import java.util.Scanner;


public class Problem {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        /*
        System.out.println("Enter number of variables: ");
        int len = y.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            System.out.println("Enter Element: ");
            arr[i]=y.nextInt();
        }
        System.out.println(Arrays.toString(resample(arr, 2)));
        */
        System.out.println("Enter number of rows: ");
        int r = y.nextInt();
        System.out.println("Enter number of colmn: ");
        int c = y.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("Enter Element: ");
                arr[i][j]=y.nextInt();
            }
        }
        for(int[] a: resample(arr,2.5)){
            System.out.println(Arrays.toString(a));
        }
        y.close();
    }

    public static int[] resample(int[] datapoints){
        int len = datapoints.length;
        int newlen = len+(len-1);
        int[] arr = new int[newlen];
        for(int i=0, k=0; i<newlen; i++){
            if((i+1)%2==0){
                arr[i] = (datapoints[k]+datapoints[k-1])/2;
            }else{
                arr[i] = datapoints[k++];
            }
        }
        return arr;
    }
    public static int[] resample(int[] datapoints, int scale){
        int len = datapoints.length;
        int newlen = len+(scale*(len-1));
        int[] arr = new int[newlen];
        for(int i=0, k=0, d=0; i<newlen; i++, d++){
            if(d>0){
                arr[i] = (datapoints[k-1]*(scale-d+1) + datapoints[k]*(d))/(scale+1);
                if(d==scale)
                    d=-1;
            }else{
                arr[i] = datapoints[k++];
            }
        }
        return arr;
    }
    public static int[] resample(int[] datapoints, double scale){
        int len = datapoints.length;
        int newlen = len+ (int)(scale*(len-1));
        int[] arr = new int[newlen];
        double t;
        for(int i=0, k=0, d=0; i<newlen; i++, d++){
            if(d>0){
                t = (datapoints[k-1]*(scale-d+1) + datapoints[k]*(d))/(scale+1);
                arr[i] = (int)t;
                if(d==scale)
                    d=-1;
            }else{
                arr[i] = datapoints[k++];
            }
        }
        return arr;
    }
    public static int[][] resample(int[][] image){
        int len = image.length;
        int newlen = len+(len-1);
        int[][] arr = new int[newlen][newlen];
        for(int i=0, k=0; i<newlen; i+=2, k++){
            arr[i] = resample(image[k]);
        }
        int[] temp = new int[len];
        int[] result;
        for(int i=0; i<newlen; i++){
            for(int j=0, k=0; j<newlen; j+=2, k++){
                temp[k] = arr[j][i];
            }
            result = resample(temp);
            for(int j=0; j<newlen; j++){
                arr[j][i] = result[j];
            }
        }
        return arr;
    }
    public static int[][] resample(int[][] image, int scale){
        int len = image.length;
        int newlen = len+(scale*(len-1));
        int[][] arr = new int[newlen][newlen];
        for(int i=0, k=0; i<newlen; i+=scale+1, k++){
            arr[i] = resample(image[k],scale);
        }
        int[] temp = new int[len];
        int[] result;
        for(int i=0; i<newlen; i++){
            for(int j=0, k=0; j<newlen; j+=scale+1, k++){
                temp[k] = arr[j][i];
            }
            result = resample(temp,scale);
            for(int j=0; j<newlen; j++){
                arr[j][i] = result[j];
            }
        }
        return arr;
    }
    public static int[][] resample(int[][] image, double scale){
        int len = image.length;
        int newlen =  len+ (int)(scale*(len-1));
        int[][] arr = new int[newlen][newlen];
        for(int i=0, k=0; i<newlen; i+=scale+1, k++){
            arr[i] = resample(image[k],scale);
        }
        int[] temp = new int[len];
        int[] result;
        for(int i=0; i<newlen; i++){
            for(int j=0, k=0; j<newlen; j+=scale+1, k++){
                temp[k] = arr[j][i];
            }
            result = resample(temp,scale);
            for(int j=0; j<newlen; j++){
                arr[j][i] = result[j];
            }
        }
        return arr;
    }
}
