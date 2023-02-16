package org.example;

import java.util.*;

public class S3 {
    public static void main(String[] args) {

        int a = 1;
        String s = "";
        int[] ar = new int[5];

        //////// array list


        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("true");
        list.add("Привет");
        list.add(1, "one");
        list.add("2");
        list.add("3");
        list.add("4");
        list.set(1, "two");
        String s1 = list.get(1);
//        list.remove(1); //удалить из массива
//        System.out.println(list.remove("two")); показывает true потому что нашёл и удалил
//        System.out.println(list.remove("two")); показывает false потому что не нашёл
        String[] j = new String[list.size()];
        list.toArray(j);

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("true");
        list1.add("Привет");
        list1.add(1, "one");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.set(1, "two");

//        list.subList(1,12);
        list.forEach(n -> System.out.println(n)); // пробежаться циклом по элементам
        System.out.println(list1);

        for (String str: list) {
             str = "r";
            
        }
        System.out.println((list));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){ // возвращает истину пока не перебрали все элементы
            String str = iterator.next();
            if (str.equals(("1")))iterator.remove(); // можно удалять, но нельзя изменять
        }


//        ListIterator<String> iterator1 = list.Listiterator(list.size()-1);
//        while (iterator1.hasNext()){ // возвращает истину пока не перебрали все элементы
//            String str = iterator1.next();
//            if (str.equals(("1")))iterator1.remove(); // можно удалять, но нельзя изменять
//        }

        list.retainAll(list1); // принимает в себя другой список и оставляет только те элементы, которые есть в обоих списках

        list.removeAll(list1); //принимает в себя другой список и оставляет только уникальные

        list.isEmpty();
        boolean b = list.size()==0;


        System.out.println(list);

        //////// Linked List

        LinkedList<String> list2 = new LinkedList<>(); // нет индексов

        Collections.sort(list2); // сортировка
//        list.forEach(n -> list3.add(0, n));

    }
}
