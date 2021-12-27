package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double a = calculator.division(28, 5);
        calculator.incrementCountOperation();
        double b = calculator.exponentation(a, 2);
        calculator.incrementCountOperation();
        double c = calculator.multiplication(15, 7);
        calculator.incrementCountOperation();
        double d = calculator.addition(b, c);
        calculator.incrementCountOperation();
        double result = calculator.addition(d, 4.1);
        calculator.incrementCountOperation();
        System.out.println (result);
        System.out.println("Количество операций - " + calculator.getCountOperation());

    }
}
