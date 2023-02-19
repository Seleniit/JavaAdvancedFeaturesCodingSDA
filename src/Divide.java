/* Create the "divide" method which has to divide the two numbers
    that are the attributes on the method.
    In case the second parameter of the method is 0,
    a non-default exceptions should be thrown: CannotDivideBy0Exception.
   */

public class Divide {
    public int firstNumber; //instance field
    public int secondNumber;

    public Divide(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void divide(int firstNumber, int secondNumber) throws CannotDivideBy0Exception{

        if (secondNumber != 0 ){
            float fi = firstNumber;
            float fk = secondNumber;
            float division = fi/fk;
        System.out.println(division);

        } else {
            throw new CannotDivideBy0Exception("Zero cannot divide any number!");
        }
    }

    public static void main(String[] args) throws CannotDivideBy0Exception {
        Divide testDivide = new Divide(0,0);
        testDivide.divide(10, 0);
    }
}

/* IFig TÖÖTAV KOOD
public class Divide {
    public int firstNumber; //instance field
    public int secondNumber;

    public Divide(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void divide(int firstNumber, int secondNumber){
        int i = firstNumber;
        int k = secondNumber;
        if (k == 0)
        {
            System.out.println("Zero cannot divide any number!");
        } else {
            float fi = i;
            float fk = k;
            float division = fi/fk;
            System.out.println(division);
            }
    }

        public static void main(String[] args) {
        Divide testDivide = new Divide(0,0);
        testDivide.divide(10, 2);
    }
}
 */