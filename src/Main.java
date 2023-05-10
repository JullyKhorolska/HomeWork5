import Calculator.Calculator;
import java.util.Scanner;
public class Main {
   static Scanner scan = new Scanner(System.in);
    static double value;
    static public double scanValueOne(){
        System.out.println("Enter value of first element");
        value = scan.nextDouble();
        return value;
    }
    static public double scanValueTwo(){
        System.out.println("Enter value of second element");
        value = scan.nextDouble();
        return value;
    }
    public static void main(String[] args) {
        System.out.println(" 1 - Sum; \n 2 - subtraction;\n 3 - multiplication;\n 4 - division;\n 5 - sqrtOfNumber;\n 6 - percentageOfTheNumber\n");

        int value = scan.nextInt();

        switch (value){
            case 1: Calculator.sum(scanValueOne(), scanValueTwo()); break;
            case 2: Calculator.subtraction(scanValueOne(),scanValueTwo()); break;
            case 3: Calculator.multiplication(scanValueOne(), scanValueTwo()); break;
            case 4: Calculator.division(scanValueOne(), scanValueTwo()); break;
            case 5: Calculator.sqrtOfNumber(scanValueOne()); break;
            case 6: Calculator.percentageOfTheNumber(scanValueOne(), scanValueTwo()); break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
        scan.close();
    }
}