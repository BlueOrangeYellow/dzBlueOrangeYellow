package home_work_3.runners;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;

import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/*
не удалось завершить
 */

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calculator_WithOperator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calculator_WithMathCopy = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calculator_WithMathExtends = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        public double result (ICalculator calculator){
            double a = calculator.division(28, 5);
            double b = calculator.exponentation(a, 2);
            double c = calculator.multiplication(15, 7);
            double d = calculator.addition(b, c);
            double result = calculator.addition(d, 4.1);
            System.out.println(result);
            System.out.println("Количество операций - " + calculator.getCountOperation());
        }
        System.out.println(calculator_WithOperator.getCountOperation());
        System.out.println(calculator_WithMathCopy.getCountOperation());
        System.out.println(calculator_WithMathExtends.getCountOperation());
    }
}
