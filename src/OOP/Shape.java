package OOP;

public class Shape {
    public String color;
    public boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }
    public Shape(String color, boolean isFilled) {
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

    @Override
    public String toString() {
        return "XX Shape Class toString method XX Shape with color of " +
                 color + " is " + isFilled + ".";
    }
}
