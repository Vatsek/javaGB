package org.example;

import java.util.HashMap;

public class PT5 {
    public static void main(String[] args) {
        // 1. Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Первый", "Ольга");
        hm.put("Второй", "Анна");
        hm.put("Третий", "Светлана");
        hm.put("Четвертый", "Юлия");
        hm.put("Пятый", "Наталья");
        hm.put("Шестой", "Александра");

        hm.forEach((k, v) -> System.out.println(v));

        System.out.println("-".repeat(20));


        // 2. Добавить ко всем значениям символ "!"
        for(String key: hm.keySet()) {
            hm.compute(key, (k, v) -> v + "!");
        }
        hm.forEach((k, v) -> System.out.println(v));

        System.out.println("-".repeat(20));

        // 3. Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают
        // с ключами первого. Объединить значения во втором множестве и первом, если ключи совпадают.
        // Вывести результат в консоль.

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "Иван");
        hm2.put("Второй", "Петр");
        hm2.put("Третий", "Семен");
        hm2.put("Восьмой", "Василий");
        hm2.put("Пятый", "Сергей");
        hm2.put("Десятый", "Алексей");

        for(String k: hm2.keySet()) {
                hm2.merge(k, hm.getOrDefault(k, "no"), (key, val) -> key + " + " + val);
                System.out.println(hm2.get(k));

        }
    }
}
