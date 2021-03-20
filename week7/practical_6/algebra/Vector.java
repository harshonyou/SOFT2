package week7.practical_6.algebra; // algebra


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

    public int size(){
        return arr.length;
    }

    public Double get(int index){
        if (index<0 || index>=arr.length){
            throw new InvalidDimensionException(Integer.toString(index));
        }
        return arr[index];
    }

    public Double set(int index, double value){
        if (index<0 || index>=arr.length){
            throw new InvalidDimensionException(Integer.toString(index));
        }
        double d = arr[index];
        arr[index] = value;
        return d;
    }

    public Vector scalarProduct(double scalar){
        double [] ar = arr.clone();
        for(int i=0; i<ar.length; i++){
            ar[i] = ar[i]*scalar;
        }
        return new Vector(ar);
    }

    public Vector add(Vector other) throws IncompatibleDimensionException{
        if(arr.length != other.size()){
            throw new IncompatibleDimensionException(Integer.toString(other.size()));
        }
        double [] ar = arr.clone();
        for(int i=0; i<ar.length; i++){
            ar[i] = ar[i]+other.get(i);
        }
        return new Vector(ar);
    }

    public boolean equals(Object other){
        if(other == this)
            return true;
        if(other instanceof Vector){
            Vector v = (Vector) other;
            if(arr.length != v.size()){
                return false;
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i] != v.get(i))
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        double [] d = {1.0,2.0,3.0};
        Vector a = new Vector(d);
        System.out.println(a.toString());
        System.out.println(a.size());
        System.out.println(a.get(0));
        System.out.println(a.set(1, 6.0));
        System.out.println(a.toString());
        System.out.println(a.scalarProduct(5.0).toString());
        System.out.println(a.toString());

        double [] dd = {1.0,2.0,3.0,4.0};
        Vector b = new Vector(dd);

        try {
            System.out.println(a.add(b));
        } catch (IncompatibleDimensionException e) {
            System.out.println("cannt perform vector addititon as the dimentison are not compatible");
            e.printStackTrace();
        }
        System.out.println(a.toString());

        Vector bb = new Vector(d);
        System.out.println(a.equals(bb));
    }
}
