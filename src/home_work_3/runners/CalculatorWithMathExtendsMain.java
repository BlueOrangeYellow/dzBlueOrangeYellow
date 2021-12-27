package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double a = calculator.division(28, 5);
        double b = calculator.exponentation(a, 2);
        double c = calculator.multiplication(15, 7);
        double d = calculator.addition(b, c);
        double result = calculator.addition(d, 4.1);
        System.out.println(result);
    }
}
