package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class S3_1 {
    public static void main(String[] args) {
        // Создать новый список ArrayList. Добавить 5 элементов. 3 способами вывести на экран

        ArrayList<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Se");
        list.add("E");

        System.out.println(list);
//1
        for (String el: list) {
            System.out.println(el);
        }
        System.out.println("*".repeat(10));
//2
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("*".repeat(10));
//3
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String el = iterator.next();
            System.out.println(el);
        }
//      сделать второй список и заполнить его данными из первого списка в обратном порядке двумя методами
//1
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);

//2
        ArrayList<String> list3 = new ArrayList<>();
        iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            list3.add(iterator.previous());
        }
        System.out.println(list3);

        list.forEach(n -> list3.add(0, n));
        System.out.println(list3);

    // 3 найти длину строки

        float sum = 0;

        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            sum += el.length();

        }
        float average = sum / list.size();

        while (iterator.hasNext()) {
            String el = iterator.next();
            if (el.length() < average) {
                iterator.remove();
            }

        }
        System.out.println(list);

        list2.removeAll((list2));





    }
}
// найти
//
//
//    ArrayList<String> list = new ArrayList<>();
//        list.add("Первый");
//                list.add("Второй");
//                list.add("Третий");
//                list.add("Четвертый");
//                list.add("Пятый");
//                list.add("Щ");
//                list.add("Се");
//                list.add("Вос");
//                list.add("Девят");
//                System.out.println(list);
//                for (String el : list) {
//                System.out.println(el);
//                }
//                System.out.println("*".repeat(10));
//
//                for (int i = 0; i < list.size(); i++) {
//        System.out.println(list.get(i));
//        }
//        System.out.println("*".repeat(10));
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//        String el = iterator.next();
//        System.out.println(el);
//        }
//        ArrayList<String> list2 = new ArrayList<>();
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//        list2.add(list.get(i));
//        }
//        list2.add("новое");
//        list2.add("новое2");
//        list2.add("что-нибудь");
//        System.out.println(list2);,
//        ArrayList<String> list3 = new ArrayList<>();
//        iterator = list.listIterator(list.size());
//
//      /while (iterator.hasPrevious()){
//            list3.add(iterator.previous());
//        }
//        System.out.println(list3);*/
//
//        list.forEach(n -> list3.add(0, n));
//        System.out.println(list3);
//
//        int sum = 0;
//        iterator = list.listIterator();
//        while (iterator.hasNext()) {
//        String el = iterator.next();
//        sum += el.length();
//        }
//        int average = sum / list.size();
//        System.out.println(average);
//        iterator = list.listIterator();
//        while (iterator.hasNext()) {
//        String el = iterator.next();
//        if ( el.length() < average){
//        iterator.remove();
//        }
//        }
//        System.out.println(list);
//
//        list2.removeAll(list);
//
//        System.out.println(list2);
//