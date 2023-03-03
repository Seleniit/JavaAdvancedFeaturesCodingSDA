package Exceptions_exercises;
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

    public void divide(int firstNumber, int secondNumber) throws CannotDivideBy0Exception {

        if (secondNumber != 0 ){
            float fi = firstNumber;
            float fk = secondNumber;
            float division = fi/fk;
        System.out.println(division);

        } else {
            throw new CannotDivideBy0Exception("Zero cannot divide any number!");
        }
    }

    /*public static void main(String[] args)  { //I version is "cleaner". Less red notifications. Exit cod 0
        try {
            Divide testDivide = new Divide(0,0);
            testDivide.divide(10, 0);
        } catch (CannotDivideBy0Exception e) {
          //  throw new RuntimeException(e);
            System.err.println(e);
        }

     */
        public static void main(String[] args)  throws CannotDivideBy0Exception { //II version is working too, but more notifications. Exit code 1
           //try {
                Divide testDivide = new Divide(0,0);
                testDivide.divide(10, 0);
            //} catch (CannotDivideBy0Exception e) {

          //              throw new RuntimeException(e);
              //  System.err.println(e);
//            }
}
}
