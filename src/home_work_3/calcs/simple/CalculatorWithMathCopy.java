package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {
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
