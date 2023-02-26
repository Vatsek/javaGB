import jdk.dynalink.beans.StaticClass;

import java.util.Random;




public class  S1 {
    //примитивные типы
    int x = 0; // 23 бита
    long l = 0; // 64 бита целое
    byte b; // 8 бит
    short sh; // 16 бит
    float f = 1.4f; // дробное 32 бита
    double d = 1.2; // дробное 64 бита
    boolean bool = true;

    // ссылочные типы (сылка на данные)
    static String str = "hello";
    char ch = 'r'; // 16 бит без знака


    // сигнатура метода. Это точка входа (сокращение либо main либо psvm)
    public static void main(String[] args) {
        int[] ints = new int [10];
        ints[4] = 5;
        System.
                out. // перенос методов
                println(ints[4]); // сокращенно sout
        System.out.println(Integer.toBinaryString(75843)); // число в двоичном представлении

//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = random.nextInt(100);
//            if (ints[i] % 2 !=0) {
//                System.out.println(ints[i]);
//            }
//        }

        int[] tmp = new int[ints.length + 1];

        for (int i = 0; i < ints.length; i++) {
            tmp[i] = ints[i];
        }
        ints = tmp;

        str = "Hello World!";
        str += "?";
        String str2 = "hello World";
        System.out.println(str.toLowerCase());
        if (str.equals((str2))) System.out.println("Equal!");//метод сравнивания строк
        if (str.contains((str2))) System.out.println("Сontains!");//метод определяет содержится ли одно в другом
        System.out.println(("Hi".repeat(5)));
        System.out.println(str.replace(str2, "big")); // заменяет в строке
        String[] sStr = str.split("!");

        int a =0;
    }


}
