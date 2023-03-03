package OOP;

public class RectangleT4 extends ShapeT4{
    public double width;
    public double length;

    public RectangleT4(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(double width, double length){
        double areaRectangle = width * length;
        return areaRectangle;
    }

    public double getPerimeter(double width, double length){
        double perimeterRectangle = 2*(width + length);
        return perimeterRectangle;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "XX Rectangle Class toString method, which overwrites Shape class same method XX Rectangle with color of " + color + " Rectangle with width = " + width +
                " and length = " + length +
                " which is a subclass of Shape class";
    }
}
