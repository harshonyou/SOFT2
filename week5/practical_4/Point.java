package week5.practical_4;

public class Point {
    public double x, y;
    private String color;

    public Point(){
        x = y = 0.0;
        color = "black";
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        color = "black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "X: "+this.x+", Y:"+this.y;
    }

    public static void main(String[] args) {
        Point x = new Point(69,60);
        System.out.println(x.getColor());
    }
}
