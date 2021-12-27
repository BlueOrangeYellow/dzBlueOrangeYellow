package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

//7.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
//	7.2 Внутри класса CalculatorWithCounterAutoComposite мы должны создавать поле хранящее объект класса калькулятор и инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
//	7.3 Внутри класса CalculatorWithCounterAutoAgregation нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам другой программист при использовании вашего класса в конструктор.
//		7.3.1 В данном классе должны быть следующие варианты конструктора:
//			7.3.1.1 Принимающий объект типа CalculatorWithOperator
//			7.3.1.2 Принимающий объект типа CalculatorWithMathCopy
//			7.3.1.3 Принимающий объект типа CalculatorWithMathExtends
//	7.4 Данные классы напрямую не умеет считать математику, они умеет делегировать расчёт математики другим калькуляторам которые сохранены в полях.
//	7.5 В классах должны присутствовать математические методы:
//		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).

public class CalculatorWithCounterAutoAgregation {

    long countOperation;

    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy=calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    //деление
    public double division(double a, double b) { return a / b; }

    //умножение
    public double multiplication(double a, double b) {
        return a * b;
    }

    //сложение
    public double addition(double a, double b) {
        return a + b;
    }

    // вычитание
    public double subtraction(double a, double b) {
        return a - b;
    }

    // возведение в степень
    public double exponentation (double a, double b) {
        return Math.pow(a, b);
    }
    // модуль числа
    public double module (double a) {
        return Math.abs(a);
    }
    // извлечение квадратного корня
    public double root (double a) {
        return Math.sqrt(a);
    }

}
