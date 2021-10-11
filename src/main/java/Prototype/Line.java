package Prototype;

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(Line other) {
        this(other.start, other.end);
    }

    public Line deepCopy() {
        return new Line(new Point(this.start.x,this.start.y), new Point(this.end.x,this.end.y));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start.toString() +
                ", end=" + end.toString() +
                '}';

    }
}