package week5.practical_4;

public class Diamond extends Shape{
    public double height, side;

    public Diamond(){
        height = side = 1.0;
    }
    public Diamond(double height, double side){
        this.height = height;
        this.side = side;
    }
    public Diamond(double height, double side, String color, boolean filled){
        super(color, filled);
        this.height = height;
        this.side = side;
    }

    public double getArea(){
        return height*side;
    }

    public double getPerimeter(){
        return 4*side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Diamond with Heigh: "+height+" and Side: "+side;
    }
}
