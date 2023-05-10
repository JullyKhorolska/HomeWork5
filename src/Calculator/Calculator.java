package Calculator;
public class Calculator {


    static public void sum (double a, double b){

        System.out.println(a + " + " + b + " = " + (a + b));
    }
    static public void subtraction (double a, double b){
        System.out.println(a + " - " + b + " = " + (a - b));

    }
    static public void division (double a, double b){
        if(b == 0){
            throw new ArithmeticException("We can't divide by zero");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
    static public void multiplication (double a, double b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    static public void sqrtOfNumber (double a){
        System.out.println("Sqrt of the number " + a + " = " + (Math.sqrt(a)));
    }
    static public void percentageOfTheNumber (double number, double percent){
        System.out.println(percent + "% " + "of the number " + number + " = " + (number * percent / 100));
    }
}
