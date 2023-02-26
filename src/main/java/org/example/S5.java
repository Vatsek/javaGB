package org.example;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class S5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Z"); // если нет такого ключа - добавит, если есть, заменит значение
        hashMap.putIfAbsent(1, "z"); // добавит только если отсутствует
        hashMap.remove(1); // удалит по ключу
        hashMap.put(0,"a");
        hashMap.put(1,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.get(0); // получить значение
        hashMap.getOrDefault(6, "def"); // если такого ключа нет, вернет значение по умолчанию

        hashMap.forEach((k, v) ->System.out.println(k + " " + v));

        for (String s: hashMap.values()) { // перебор по значениям
            System.out.println(s);
        }

        for (Integer n: hashMap.keySet()) { // перебор по ключам
            System.out.println(n);
        }

        for (Integer n: hashMap.keySet()) { // перебор по ключам с получением и выводом значений. Удалять значения тут нельзя, т.к. конструкция for each поломается
            System.out.println(hashMap.get(n));
        }

        //перебор циклом for. Просходит по ключам

        for (int i = 0; i < hashMap.keySet().size(); i++) {
            System.out.println(hashMap.get(hashMap.keySet().toArray()[i]));
        }

        hashMap.containsValue("z"); // boolean показывает есть ли значение


        hashMap.compute(3, (k, v) -> v += "!"); // позволяет изменить значение по ключу
        hashMap.computeIfAbsent(5, v -> "F!"); // сработает только если ключа не существует. Запишет под ключом 5 значение
        hashMap.computeIfPresent(5, (k, v) -> v += "!"); // срабатывает если такой ключ существует

        hashMap.merge(4, "?", String::concat);
        hashMap.merge(4, "?", (nV, tV) -> "<" + nV + tV + ">");

        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

//      -> это значок это lambda

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); // сохраняет порядок ввода, в отличие от hashmap

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("ih1", "O");
        treeMap.put("oi2", "T");
        treeMap.put("gcv3", "T");
        treeMap.put("ty4", "F");
        treeMap.forEach(( k, v ) ->System.out.println(k + " " + v));

        treeMap.tailMap("oi2", true);
        treeMap.headMap("oi2", false);
    }
}
