package OOP;

public class SquareT4 extends RectangleT4{
    // siin on näha, et Square klass pärib omadused "color" ja "isFilled" läbi Rectangle klassi.
    // samas ei saa ta ligi Circle klassi väärtusele "radius"

    public SquareT4(String color, boolean isFilled, double width, double length){
        super(color, isFilled, width, length);}
    // kuna superklassis on meetodid, mis arvutavad väärtuste "widht" ja "length" järgi aga ruudul on need võrdsed,
    // (ilmselt küsitakse kasutajalt vaid 1 mõõtu ja programm peab oskama seda arvestada)
    // siis on vaja kirjutada üle meetodid setWidth ja setLength


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
        //double width = length;
        //super.setLength(width);
    }


}
