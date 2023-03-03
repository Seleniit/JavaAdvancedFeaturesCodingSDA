package OOP;

public class Task3_ShapeCircleRectangle_Square {
    public static void main(String[] args) {
        Shape shape = new Shape("green", true);
        System.out.println(shape);
        Circle circleShape = new Circle("red", false,3);
        System.out.println(circleShape);

        Rectangle rectangle = new Rectangle("yellow", true,2,4 );

        System.out.println(rectangle.getArea(2,4));

        System.out.println(rectangle);

        Square square = new Square("blue",true, 1,0);
        System.out.println(square.getArea(1,6)); //rectangle meetodit üle kirjutava meetodiga on jama, Ei asenda kõiki pikkuseid width - iga.

    }
}
