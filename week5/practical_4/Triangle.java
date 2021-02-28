package week5.practical_4;

public class Triangle extends Shape{
    public double s1, s2, s3;

    public Triangle(){
        s1 = s2 = s3 = 1.0;
    }
    public Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public Triangle(double s1, double s2, double s3, String color, boolean filled){
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea(){
        double s = (s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    public double getPerimeter(){
        return s1+s2+s3;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "A Triangle with sides: "+s1+","+s2+","+s3;
    }
}
