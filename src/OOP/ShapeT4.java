package OOP;

public abstract class ShapeT4 {
    protected String color;
    protected boolean isFilled;

    public ShapeT4() {
        this.color = "unknown";
        this.isFilled = false;
    }
    public ShapeT4(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract float getArea();

  //  public abstract float getArea(float radius);

    public abstract float getPerimeter();


    @Override
    public String toString() {
        return "XX Shape Class toString method XX Shape with color of " +
                color + " is " + isFilled + ".";
    }
}
