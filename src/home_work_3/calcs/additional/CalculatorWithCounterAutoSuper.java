package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoSuper extends home_work_3.calcs.simple.CalculatorWithMathExtends {

    int countOperation = 0;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    public double exponentation(double a, int b) {
        incrementCountOperation();
        return super.exponentation(a, b);
    }

    public double root(double a) {
        incrementCountOperation();
        return super.root(a);
    }

    public double module(double a) {
        incrementCountOperation();
        return super.module(a);
    }
}
