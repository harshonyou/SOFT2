package algebra;

public class Vector {

    public double[] vector;

    public Vector(double[] data) {
        vector = data.clone();
    }

    public int size() {
        return vector.length;
    }

    @Override
    public String toString() {
        StringBuffer output = new StringBuffer("[");
        for (int i = 0; i < vector.length - 1; i++) {
            output.append(vector[i] + ", ");
        }
        output.append(vector[vector.length - 1] + "]");
        return output.toString();
    }

    public double get(int index) {
        // InvalidDimensionException is an unchecked exception and therefore
        // does not need to be claimed in the method's header.
        if (index < 0 || index >= vector.length) {
            throw new InvalidDimensionException(Integer.toString(index));
        }
        return vector[index];
    }

    public double set(int index, double value) {
        // InvalidDimensionException is an unchecked exception and therefore
        // does not need to be claimed in the method's header.
        if (index < 0 || index >= vector.length) {
            throw new InvalidDimensionException(Integer.toString(index));
        }

        double old = vector[index];
        vector[index] = value;
        return old;
    }

    public Vector scalarProduct(double scalar) {
        double[] data = new double[size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = scalar * get(i);
        }
        return new Vector(data);
    }

    public Vector add(Vector other) throws IncompatibleDimensionException {
        // IncompatibleDimensionException is a checked exception and therefore
        // MUST be claimed in the method's header.
        if (other.size() != this.size()) {
            throw new IncompatibleDimensionException(Integer.toString(other.size()));
        }
        double[] data = new double[size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = other.get(i) + this.get(i);
        }
        return new Vector(data);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector)) {
            return false;
        }
        Vector v = (Vector) other;
        if (this.size() != v.size()) {
            return false;
        }
        for (int i = 0; i < vector.length; i++) {
            if (v.get(i) != this.get(i)) {
                return false;
            }
        }
        // if we are here, the two vector have the same dimension and the same
        // values, therefore they are equals.
        return true;
    }

    public static void main(String[] args) {

        double[] data = { 3, 4, 5 };
        Vector v = new Vector(data);
        System.out.println(v);
        System.out.println(data[0] == v.vector[0]);
        // double[] data = { 1, 2, 3, 4 };
        // Vector v = new Vector(data);
        // System.out.println(v);
        // Vector v2 = new Vector(data);
        // System.out.println(" ==? " + (v == v2) + ", equals()? " + v.equals(v2));
        // System.out.println("null ==? " + (v == null) + ", equals()? " +
        // v.equals(null));
        // Vector v3 = new Vector(new double[] { 5, 1, 3, 2 });

        // // add may throw a checked exception, so it must be called within a try
        // // block.
        // try {
        // v2 = v.add(v3);
        // } catch (IncompatibleDimensionException ex) {
        // System.out.println("cannot perform vector addition as the dimension are not
        // compatible");
        // ex.printStackTrace();
        // }
        // // get throws an unchecked exception, and therefore does not need to be
        // // in a try-catch block. However, as there is no handler to catch the
        // // exception, the application crashes.
        // System.out.println(v2.get(5));
    }
}