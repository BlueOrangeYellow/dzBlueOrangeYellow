package home_work_3.calcs.additional;

public class CalculatorWithCounterClassic extends home_work_3.calcs.simple.CalculatorWithMathExtends {

    int countOperation = 0;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

}