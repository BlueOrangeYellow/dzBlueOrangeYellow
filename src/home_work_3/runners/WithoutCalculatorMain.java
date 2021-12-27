package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

            double a = 28.0/5; // 5.6
        System.out.println("Результат выражения 28/5 - " + a);
            double b = a * a; // 31.359999999999996
        System.out.println("Результат выражения (28/5)^2 - " + b);
            double c = 15 * 7; // 105
        System.out.println("Результат выражерния 15*7 - " + c);
            double d = b + c; // 31.359999999999996
            double result1 = 4.1 + d; // 140.45999999999998

        System.out.println("Результат выражения 4.1 + 15*7 + (28/5)*(28/5) - " + result1);
    }
}
