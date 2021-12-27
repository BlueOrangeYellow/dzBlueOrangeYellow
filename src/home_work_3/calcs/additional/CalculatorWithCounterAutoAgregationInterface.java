package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

//9.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса +
//	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static) +
//	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator +
//	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
//	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
//	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    public ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface (ICalculator calculator){
    this.calculator = calculator;
    }

    public long countOperation;
    public void incrementCountOperation(){
        ++countOperation;
    }

    public long getCountOperation() {
        return countOperation;
    }

    // реализация всех методов интерфейса
    //деление
    public double division(double a, double b) {
        incrementCountOperation();
    return a / b; }

    //умножение
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return a * b;
    }

    //сложение
    public double addition(double a, double b) {
        incrementCountOperation()
        return a + b;
    }

    // вычитание
    public double subtraction(double a, double b) {
        incrementCountOperation()
        return a - b;
    }

    // возведение в степень
    public double exponentation (double a, double b) {
        incrementCountOperation();
        return Math.pow(a, b);
    }
    // модуль числа
    public double module (double a) {
        incrementCountOperation();
        return Math.abs(a);
    }
    // извлечение квадратного корня
    public double root (double a) {
        incrementCountOperation();
        return Math.sqrt(a);
    }

}
