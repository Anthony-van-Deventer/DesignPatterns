package Prototype;

public class Demo {
    public static void main(String[] args) {
        Point start = new Point(3,3);
        Point end = new Point(10, 10);

        Line line1 = new Line(start, end);
        System.out.println(line1.toString());

        Line line2 = line1.deepCopy();
        line1.start.x = line1.end.x = line1.start.y = line1.end.y = 0;
        System.out.println("line 2 : " + line2.toString());
        System.out.println("line 1 : " + line1.toString());
    }
}
