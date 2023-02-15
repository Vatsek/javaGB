package org.example;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {

//        String str = "Hello";
//        str = str.replace("ll", "oo");
//
//        StringBuilder builder = new StringBuilder(("Hello"));
//        str = builder.toString();
//
//    //    builder.append(true);
//    //    System.out.println(builder);
//        builder.append(true).append("!=").append(false);
//        builder.deleteCharAt(0);
//        builder.reverse();
//        // builder.indexOf() - поиск по индексу
//        builder.insert(builder.length()/2, 7.34f); // вставить в середину
//        //builder.subSequence()
//        System.out.println(builder);

        String str = "Hello";


        StringBuilder builder = new StringBuilder((""));

        long begin = System.currentTimeMillis(); // возвращает кол-во миллисекунд с 1 января 1970

        for (int i = 0; i < 1000; i++) {
            str += "!";
        }
        for (int i = 0; i < 1000; i++) {
            builder.append("!");
        }



        long end = System.currentTimeMillis();

        System.out.println(end - begin);

//        //
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 20000; i++) {
//            str += Character.getName(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - begin);
//
//        begin = System.currentTimeMillis();
//        for (int i = 0; i < 20000; i++) {
//            builder.append(Character.getName(i));
//        }
//        end = System.currentTimeMillis();
//        System.out.println(end - begin);
        //

        //sout - для быстрого набота system.out.print ....

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введиете чего нибудь: ");
        String in = scanner.nextLine();








    }



}


/*
*
*
* */