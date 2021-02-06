package week4.practical_3;

public class Vector {
    private double arr[];

    public Vector(double[] arr){
        this.arr = arr;
    }

    public String toString(){
        String temp="[";
        for(double d: arr){
            temp+=d+", ";
        }
        if(temp.length()!=1){
            return temp.substring(0,temp.length()-2)+"]";
        }
        return temp+"]";
    }

    public static void main(String[] args) {
        double [] d = {1.0,2.0,3.0};
        Vector a = new Vector(d);
        System.out.println(a.toString());
    }
}
