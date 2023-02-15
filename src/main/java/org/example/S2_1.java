package org.example;

import java.util.Scanner;

public class S2_1 {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        String str1 = scanner.nextLine();
//
//        System.out.println("Введите вторую строку: ");
//        String str2 = scanner.nextLine();
//
//        if (str1.contains(str2)){
//            System.out.println("Найдено вхождение");
//        }
//        else {
//            System.out.println("Вхождение не найдено");
//        }
//
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строчку");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строчку");
        String str2 = scanner.nextLine();

        StringBuilder bulder1 = new StringBuilder(str1);
        StringBuilder bulder2 = new StringBuilder(str2);
        StringBuilder res = new StringBuilder();


        int indexStart = bulder1.indexOf(bulder2.toString());
        if (indexStart > 0) {
            res = bulder1.replace(indexStart, indexStart + bulder2.length(), "<Вставка>");
            System.out.println(res);

        } else {
            System.out.println("Вхождение не найдено");
        }
        ;


        if (str1.contains(str2)) {
            String res2 = str1.replace(str2, "<Вставка>");
            System.out.println(res2);

        } else {
            System.out.println("Вхождение не найдено");
        }
        ;
    }
}


/*
* long start = System.currentTimeMillis();
        int indexStart = bulder1.indexOf(bulder2.toString());
        if (indexStart > -1) {
            bulder1.replace(indexStart, indexStart + bulder2.length(), "<Вставка>".repeat(1000));
            System.out.println(bulder1);
        } else {
            System.out.println("Вхождение не найдено");
        };
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        start = System.currentTimeMillis();
        if (str1.contains(str2)) {
            String res2 = str1.replace(str2, "<Вставка>".repeat(1000));
            System.out.println(res2);
        } else {
            System.out.println("Вхождение не найдено");
        };
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
* */
