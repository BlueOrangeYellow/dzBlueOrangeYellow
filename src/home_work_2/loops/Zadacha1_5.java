package home_work_2.loops;

public class Zadacha1_5 {
    public static void main(String[] args) {
        for (int b = 1; b < 11; ++b) {
            for (int a = 2; a < 6; ++a) {
                if (a * b < 10 && b < 10) {
                    System.out.print(a + " * " + b + "  =  " + a * b + " | ");
                }
                if (a * b < 10 && b == 10) {
                    System.out.print(a + " * " + b + "  =  " + a * b + "| ");
                }
                if (a * b >= 10 && b < 10) {
                    System.out.print(a + " * " + b + "  = " + a * b + " | ");
                }
                if (a * b >= 10 && b == 10) {
                    System.out.print(a + " * " + b + " = " + a * b + " | ");
                }
            }
            System.out.println();
        }
        System.out.print("-------------------------------------------------------");
        System.out.println();
        for (int b = 1; b < 11; ++b) {
            for (int a = 6; a < 10; ++a) {
                if (a * b < 10 && b < 10) {
                    System.out.print(a + " * " + b + "  =  " + a * b + " | ");
                }
                if (a * b < 10 && b == 10) {
                    System.out.print(a + " * " + b + "  =  " + a * b + "| ");
                }
                if (a * b >= 10 && b < 10) {
                    System.out.print(a + " * " + b + "  = " + a * b + " | ");
                }
                if (a * b >= 10 && b == 10) {
                    System.out.print(a + " * " + b + " = " + a * b + " | ");
                }
            }
            System.out.println();
        }
    }
}
      /*
      выдает по горизнотали сначала все 2, потом все 3 и тд
            for(int i = 2; i < 10; i++){
                for(int k = 1; k < 10; k++){
                    int a = k * i;
                    System.out.print(i + "*" + k + "=" + i * k + " ");
                }
                System.out.println("");
                */
