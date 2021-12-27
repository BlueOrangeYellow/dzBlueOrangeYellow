package home_work_3.runners;

// 4.1 + 15 * 7 + (28 / 5) ^ 2

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double a = calculator.division(28, 5);
        double b = calculator.exponentation(a, 2);
        double c = calculator.multiplication(15, 7);
        double d = calculator.addition(b, c);
        double result = calculator.addition(d, 4.1);
        System.out.println(result);
    }

}
