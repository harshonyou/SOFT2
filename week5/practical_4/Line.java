// package week5.practical_4;

public class Line extends Point {
    public Point start, end;
    private String color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = "black";
    }

    @Override
    public String getColor() {
        return this.getColor();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2));
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line starts from (" + start.x + "," + start.y + ") to (" + end.x + "," + end.y + ")";
    }

    public static void main(String[] args) {
        Point start = new Point(15, 20);
        Point end = new Point(35, 5);
        Line line = new Line(start, end);
        System.out.println(line.getLength());
    }
}
