package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PT3 {

    public static void show (ArrayList list) {
        list.forEach(n -> System.out.print(n + " | "));
        System.out.println("\n");

    }
    public static void main(String[] args) {


//        1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("white");
        colors.add("yellow");
        colors.add("black");

        show(colors);

//        2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        show(colors);

//        3. Вставить элемент в список в первой позиции.
        colors.add(0, "brown!");
        show(colors);

//        4. Извлечь элемент (по указанному индексу) из заданного списка.

        int indx = 3;
        String col = colors.get(indx);
        System.out.println(col + "\n");

//        5. Обновить определенный элемент списка по заданному индексу.
        colors.set(indx, "pink!");
        show(colors);

//        6. Удалить третий элемент из списка.

        colors.remove(indx);
        show(colors);

//        7. Поиска элемента в списке по строке.
        String find = "black!";
        System.out.println(colors.contains(find));
        System.out.println(colors.indexOf("black!"));

//        8. Создать новый список и добавить в него несколько элементов первого списка.

        ArrayList<String> colors2 = new ArrayList<>();
        for (int i = 0; i < colors.size(); i+=2) {
            colors2.add(colors.get(i));
        }
        show(colors2);

//        9. Удалить из первого списка все элементы отсутствующие во втором списке.

        ArrayList<String> tempColors = new ArrayList<>(colors);
        tempColors.retainAll(colors2);
        show(tempColors);
        show(colors2);

////        10. *Сортировка списка.

        Collections.sort(colors);
        show(colors);

//        11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

        ArrayList<String> timeTest1 = new ArrayList<String>();
        LinkedList<String> timeTest2 = new LinkedList<>();

        long begin = System.currentTimeMillis();
        int count = 0;
        while (count <=1000) {
            timeTest1.add(0, "bug");
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);


        long begin2 = System.currentTimeMillis();
        count = 0;
        while (count <= 1000) {
//            timeTest2.add(0, "bug");
            timeTest2.addFirst("bug");
            count++;
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - begin2);
    }
}
