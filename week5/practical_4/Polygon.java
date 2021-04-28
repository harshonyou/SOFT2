
// package week5.practical_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Polygon extends Point {
    public ArrayList<Point> points;
    public int size;

    public Polygon(int sides) {
        this.size = sides;
        points = new ArrayList<Point>(sides);

    }

    public void Initialize() {
        Scanner scan = new Scanner(System.in);
        int x, y;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter ");
            x = scan.nextInt();
            y = scan.nextInt();
            points.add(new Point(x, y));
        }
        scan.close();
    }
}
