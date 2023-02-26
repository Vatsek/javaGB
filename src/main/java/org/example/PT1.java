/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        Пункты реализовать в методе main
        *Пункты реализовать в разных методах
        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */
package org.example;
import java.util.Random;

public class PT1 {
    public static int[] append(int[] array) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public  static  void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %d ", array[i]);
        }
        System.out.printf("\n");
    }
    public static int randomNumber() {
        Random random = new Random();
        int number = new Random().nextInt(2001);
        return  number;
    }

    public static int olderBitNumber(int number) {
        int n = Integer.toBinaryString((number)).length();
        return n;
    }

    public static int[] multiples(int i, int n) {
        int[] m = new int[0];
        int k = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m = append(m);
                m[k] = j;
                k++;
            }
        }
        return m;
    }

    public static int[] notMultiples(int i, int n) {
        int[] m = new int[0];
        int k = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m = append(m);
                m[k] = j;
                k++;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = randomNumber();
        System.out.printf("Случайное число от 0 до 2000: %d\n",i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = olderBitNumber(i);
        System.out.printf("Номер старшего значащего бита числа %d: %d\n",i,n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = multiples(i, n);
        System.out.printf("Все кратные %d-ти числа в диапазоне от %d до Short.MAX_VALUE(%d): \n ",n, i, Short.MAX_VALUE);
        printArray(m1);

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = notMultiples(i, n);
        System.out.printf("Все некратные %d-ти числа в диапазоне от Short.MIN_VALUE(%d) до %d: \n ",n, Short.MAX_VALUE, i);
        printArray((m2));
    }
}