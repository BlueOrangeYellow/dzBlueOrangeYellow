package home_work_1;
// вопросы к gg и hh
public class Task1 {
    public static void main(String[] args) {
        int a = 42; //0010 1010
        int b = 15; //0000 1111
        int c = a & b; // для a: 0010 1010 для b: 0000 1111; для c: 0000 1010 (соотв. 10 в десятичном виде)
        int d = a | b; // для a: 0010 1010 для b: 0000 1111 для d: 0010 1111 (соотвю 47 в десятичном виде)
        int e = a &= b; // для a до присваивания: 0010 1010 для b: 0000 1111; для e: 0000 1010 (соотв. 10 в десятичном виде) + по итогам операции a = 10
        System.out. println("a" + " после &= " + a);
        a = 42;
        b = 15;
        int f = a |= b; // для a до присваивания: 0010 1010 для b: 0000 1111 для f: 0010 1111 (соотв. 47 в десятичном виде) + по итогам операции a = 47
        System.out. println("a" + " после |= " + a);
        a = 42;
        b = 15;
        int g = a ^ b; // для a: 0010 1010 для b: 0000 1111 для g: 0010 0101 (соотв. 37 в десятичном виде)
        int h = a ^= b; // для a до присваивания: 0010 1010 для b: 0000 1111 для h: 0010 0101 (соотв. 37 в десятичном виде) + по итогам операции a = 37
        System.out. println("a" + " после ^= " + a);
        a = 42;
        b = 15;
        // во всех побитовых операторах сдвига были использованы меньшие числа для наглядности, так как при сдвиге на 15 или 42 получается запись 0000 0000, т.е. 0 в десятичном виде
        int i = a >> 2; // для a: 0010 1010 для h: 0000 1010 (соотв. 10 в десятичном виде)
        int j = b >> 2; // для b: 0000 1111 для i: 0000 0011 (соотв. 3 в десятичном виде)
        // итоги операций a >>= 2 и b >>= 2 аналогичны итогам операций с >> 2, но при этом значение a и b становятся равны i и j соответственно
        int k = a << 2; // для a: 0010 1010 для k: 1010 1000 (соотв. 168 в десятичном виде)
        int l = b << 2; // для b: 0000 1111 для l: 0011 1100 (соотв. 60 в десятичном виде)
        int m = a >>> 4; // для a: 0010 1010 для m: 0000 0010 (соотв. 2 в десятичном виде)
        int n = b >>> 3; // для b: 0000 1010 для m: 0000 0001 (соотв. 1 в десятичном виде)
        int o = ~a; // для a: 0010 1010 для o: 1101 0101 (соотв. -43 в десятичном виде)
        int p = ~b; // для b: 0000 1111 для p: 1111 0000 (соотв. -16 в десятичном виде)
        System.out.println("c = " + c); // c = 10
        System.out.println("d = " + d); // c = 47
        System.out.println("e = " + e); // e = 10
        System.out. println("f = " + f);
        System.out. println("g = " + g);
        System.out. println("h = " + h);
        System.out. println("i = " + i);
        System.out. println("j = " + j);
        System.out. println("k = " + k);
        System.out. println("l = " + l);
        System.out. println("m = " + m);
        System.out. println("n = " + n);
        System.out. println("o = " + o);
        System.out. println("p = " + p);

        System.out. println("далее - 42 и - 15");

        int aa = -42; // 1 1011 0110
        int bb = -15; // 1 1111 0001
        int cc = aa & bb; // для aa: 1 1011 0110 для bb: 1 1111 0001; для cc: 1 1011 0000 (соотв. -48 в десятичном виде)
        int dd = aa | bb; // для aa: 1 1011 0110 для bb: 1 1111 0001; для cc: 1 1111 0111 (соотвю -9 в десятичном виде)
        int ee = aa &= bb; // для aa до присваивания: 1 1011 0110 для bb: 1 1111 0001; для ee: 1 1101 0000 (соотв. -48 в десятичном виде) + по итогам операции a = - 48
        System.out. println("aa" + " после &= " + aa);
        aa = -42;
        bb = -15;
        int ff = aa |= bb; // для aa до присваивания: 1 1011 0110 для bb: 1 1111 0001; для ff: 1 1111 0111 (соотв. -9 в десятичном виде) + по итогам операции a = - 9
        System.out. println("aa" + " после |= " + aa);
        aa = -42;
        bb = 15;
        int gg = aa ^ bb; // для aa: .... 1111 1101 0110, для bb: .... 1111 1111 0001; для gg: .... 0000 0010 0111 (соотв. 39 в десятичном виде)
        int hh = aa ^= bb; // аналогично gg, но aa получает значение 39 в десятичном виде
        System.out. println("a" + " после ^= " + aa);
        aa = -42;
        bb = -15;

        // во всех побитовых операторах сдвига были использованы большие числа для наглядности
        int ii = aa >> 2; // для aa: 1 1011 0110 для h: 1 1110 1101 (соотв. -11 в десятичном виде)
        int jj = bb >> 2; // bb: 1 1111 0001 для ii: 1 1111 0000  (соотв. -4 в десятичном виде)

        int kk = aa << 2; // для aa: 1 1011 0110 для kk: 1 0101 1000 (соотв. -168 в десятичном виде)
        int ll = bb << 2; // bb: 1 1111 0001 для ll: 1 1100 0100(соотв. -60 в десятичном виде)
        int mm = aa >>> 1; // для aa: 1 1011 0110 для mm: 0111 1111 1111 1111 1111 1111 1110 1011 (соотв. 2147483627 в десятичном виде)
        int nn = bb >>> 1; // bb: 1 1111 0001 для nn: 0111 1111 1111 1111 1111 1111 1111 1000 (соотв. 2147483640 в десятичном виде)
        int oo = ~aa; // для aa: 1 1011 0110 для oo: 0 0010 1001 (соотв. +41 в десятичном виде)
        int pp = ~bb; // bb: 1 1111 0001 для pp: 0 0000 1110 (соотв. +14 в десятичном виде)
        System.out.println(Integer.toBinaryString(~aa));
        System.out.println(Integer.toBinaryString(~bb));
        System.out.println("cc = " + cc); // c = 10
        System.out.println("dd = " + dd); // c = 47
        System.out.println("ee = " + ee); // e = 10
        System.out. println("ff = " + ff);
        System.out. println("gg = " + gg);
        System.out. println("hh = " + hh);
        System.out. println("ii = " + ii);
        System.out. println("jj = " + jj);
        System.out. println("kk = " + kk);
        System.out. println("ll = " + ll);
        System.out. println("mm = " + mm);
        System.out. println("nn = " + nn);
        System.out. println("oo = " + oo);
        System.out. println("pp = " + pp);

    ///double aaa = 42.5;
    /// double bbb = ~aaa;
        // сообщение об ошибке: java: bad operand type double for unary operator '~' - ввиду того, что работа возможна с long, int, short, char, byte.
        }
}
