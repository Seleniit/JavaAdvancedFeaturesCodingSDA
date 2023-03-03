package OOP;

public class Task4_ShapeT4CircleT4RectangleT4_SquareT4 {
    public static void main(String[] args) {
        //ShapeT4 shape = new ShapeT4("green", true); // kui klass Shape on abstract, ei saa sellest luua objekti.
       // System.out.println(shape);
        CircleT4 circleShape =  new CircleT4("red", false,3);
        System.out.println(circleShape);

        RectangleT4 rectangle = new RectangleT4("yellow", true,2,4 );

        System.out.println(rectangle.getArea(2,4));

        System.out.println(rectangle);

        SquareT4 square = new SquareT4("blue",true, 1,0);
        System.out.println(square.getArea(1,6)); //rectangle meetodit üle kirjutava meetodiga on jama, Ei asenda kõiki pikkuseid width - iga.

    }
}
