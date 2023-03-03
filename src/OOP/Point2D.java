package OOP;

public class Point2D {
    public float x;
    public float y;

    public Point2D(){  }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {        //getXY method which will return x , y values as two-element array
        return new float[]{x, y};
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
                                //toString method which should return string in the following format: (x,y)
    @Override
     public String toString() {
     return String.format("(%f,%f)", x, y);
     }

}
