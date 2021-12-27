package home_work_3.calcs.simple;

public class CalculatorWithOperator {

    //деление
    public double division(double a, double b) {
        return a / b;
    }

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

    //возведение в целую степень дробного положительного числа
    public double exponentation (double a, int b) {
        if (b == 0) { // число в нулевой степени - 1)
            return 1;
        }
        if (b == 1) { // число в степени 1 - само число
            return a;
        }
        int b1 = b;
        double result = a; // при возведении в отриц. степень, число становится обратным самому себе и возводится в заданную степень
        if (b < 0) {
            result = 1 / result;
            b1 = b * (-1); // если в этот цикл "попало" число, на выходе будем уже иметь обратное и требование возвести его в |b|
        }
        // сравнение b и b1 позволяет принять решение, что делать с result - делить на самого себя, или умножать
        for (int i = 1; i < b1; ++i) {
            if (b1 != b) {
                result = result / a;
            }
            else {
                result = result * a;
            }
        }
        return result;
    }
    // модуль числа
    public double module (double a){
        return (a >= 0 ? a : 0 - a);
    }
    // корень квадратный
    public double root (double a){
            return Math.sqrt(a);
        /*
        корень из дроби равен частному от деления корня из числителя на корень из знаменателя - http://www.cleverstudents.ru/roots/extracting_of_roots.html#fractions
        для наших целей число возможно представить как десятичную дробь
        предположим, необходимо найти корень от a.b (к примеру, 25.5)
        достаточно найти корень из a, после корень из b, после разделить первый на второй
        корень 25.5 = 5,049, корень 255 = 15,96, корень 10 = 3.16, итог деления = 5.05; с округлением - верно
         */
        // осталось понять, как найти корень в принципе
        // возможно ли рассматривать a и b как натуральные числа - да
    }
}
