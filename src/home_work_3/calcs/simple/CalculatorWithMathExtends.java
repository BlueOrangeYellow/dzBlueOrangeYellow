package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double exponentation(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double module(double a) {
        return Math.abs(a);
    }

    @Override
    public double root(double a) {
        return root(a);
    }
}
