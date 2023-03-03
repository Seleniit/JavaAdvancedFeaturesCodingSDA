package OOP;

public class Line {
    public Point2D start;
    public OOP.Point2D end;
    public int start1;
    public int start2;
    public int end1;
    public int end2;

    public Line(Point2D start, Point2D end){
        this.start = start;
        this.end = end;
    }

    public Line(int start1, int end1, int start2, int end2){
        this.start1 = start1;
        this.start2 = start2;
        this.end1 = end1;
        this.end2 = end2;

        Point2D start = new Point2D(start1, end1);
        Point2D end = new Point2D(start2, end2);
        }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
}
