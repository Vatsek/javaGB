package org.example;

import java.util.HashMap;

public class S5_1 {
    public static void main(String[] args) {
        // 1. создать hashMap что бы там была ключ строка, а значение число. Записать туда 10 значений и вывести двумя способами

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Вася", "1");
        hm.put("Кеша", "2");
        hm.put("Петя", "3");
        hm.put("Ваня", "4");
        hm.put("Лёша", "5");
        hm.put("Егорка", "6");

        hm.forEach((k, v) -> System.out.println(k + " " + v));

        for(String v: hm.values()) {
            System.out.println(v);
        }


        // 2. изменить значения добавив <> в начале и в конце
        for(String key: hm.keySet()) {
            hm.compute(key, (k, v) -> "<" + v + ">");
        }
        System.out.println(hm);

        // 3. Создать еще 1 map, объединить значения с одинаковыми ключами

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "Иван");
        hm2.put("Второй", "Петр");
        hm2.put("Третий", "Семен");
        hm2.put("Четвертый", "Василий");
        hm2.put("Пятый", "Сергей");
        hm2.put("Шестой", "Алексей");

        for(String k: hm2.keySet()) {
//            hm2.merge(k, hm.getOrDefault(k, "no"), String::concat); // либо так
            hm2.merge(k, hm.getOrDefault(k, "no"), (key, val) -> key + " + " + val);
            System.out.println(hm2.get(k));
        }








    }
}
