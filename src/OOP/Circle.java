package OOP;

public class Circle extends Shape{
    public float radius;

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled); // pärib Shape klassist väljad siia konstruktorisse kasutusele
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
/*
 public float getArea() {
        return area;
    }


     public float getPerimeter() {
        return perimeter;
    }


 */
    @Override
    public String toString() {
        return new String("XX Circle Class toString method, which overwrites Shape class same method XX Circle with color of " + color + " and radius "  + radius +
                " is a subclass off Shape");
/*        return String.format("Circle with color of " + color + " and radius "  + radius +
                " is a subclass off  %s", super.toString());

 */
        // siin "String.format(......  %s", super.toString())" see osa lisab vanemklassi vastuse koos lapsklassi poolt üle kirjutatud väljadega lapsklassi tekstile otsa.
        // vt "XX Shape XX with color of "
    }
}
