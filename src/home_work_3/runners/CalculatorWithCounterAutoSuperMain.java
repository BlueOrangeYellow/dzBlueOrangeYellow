package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double a = calculator.division(28, 5);
        double b = calculator.exponentation(a, 2);
        double c = calculator.multiplication(15, 7);
        double d = calculator.addition(b, c);
        double result = calculator.addition(d, 4.1);
        System.out.println (result);
        System.out.println("Количество операций - " + calculator.getCountOperation());

    }
}
