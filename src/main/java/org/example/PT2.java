package org.example;

public class PT2 {

    public  static  String containsStr (String str1, String str2) { // вхождение одной строки в другую
        if (str1.contains(str2)) {
            return "Найдено вхождение";
        }
        else {
            return "Вхождение не найдено";
        }
    }

    public  static  String equalsStrReverse (String str1, String str2) { // вхождение реверсивной строки в другую
        StringBuilder builder2 = new StringBuilder(str2);
        builder2.reverse();
        if (str1.contains(builder2.toString())) { // определяет вхождение реверсивной строки
//        if (str1.equals(builder2.toString())) { если нужно проверить равна ли реверсивная строчка полностью, использовать это.
//                                                  по заданию не совсем понял нужен первый или второй вариант. Сделал оба
            return "Строки являются вращением друг друга (вхождение в обратном порядке)";
        }
        else {
            return "Строки не являются вращением друг друга (вхождение в обратном порядке)";
        }
    }

    public  static  String textExample (int num1, int num2, char ch) { // составление строки примера методом StringBuilder.append().
        int result = 0;
        switch (ch) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case  ('*'):
                result = num1 * num2;
                break;
            case ('/'):
                result = num1 / num2;
                break;
            default:
                return "Нет такой операции. Возможные операции: +, -, *, /";
        }
        StringBuilder example = new StringBuilder();
        example.append(num1).append(ch).append(num2).append('=').append(result);
        return example.toString();
    }

    public  static  String changeCharToTextInsDel (String str) { // замена символа на текст с помощью StringBuilder.insert(),StringBuilder.deleteCharAt().
        StringBuilder example = new StringBuilder(str);
        example.insert(example.indexOf("="), " равно ");
        example.deleteCharAt(example.indexOf("="));
        return example.toString();
    }

    public  static  String changeCharToTextReplace (String str) { // замена символа на текст с помощью StringBuilder.replace().
        StringBuilder example = new StringBuilder(str);
        example.replace(example.indexOf("="), (example.indexOf("="))+1," равно ");
        return example.toString();
    }

    public  static  String recursion (String str) { // перевернуть строку с помощью рекурсии.
        StringBuilder str2 = new StringBuilder(str);
        StringBuilder text = new StringBuilder();
        for (int i = str2.length(); i!=0 ; i--) {
            text.append(str2.charAt(i-1));
            str2.deleteCharAt(i-1);
            recursion(str2.toString());
        }
        return text.toString();
    }




    public static void main(String[] args) {

        String str1 = "Hello world";
        String str2 = "dlrow olleH";
        String str3 = "gnikrow";
        int num1 = 3;
        int num2 = 56;
        char ch = '+';

//        1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        System.out.println(containsStr(str1,str2));

//        2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        System.out.println(equalsStrReverse(str1, str2));

//        3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println(recursion(str3));

//        4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        String exampleStr = textExample(num1, num2, ch);
        System.out.println(exampleStr);

//        5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println(changeCharToTextInsDel(exampleStr));

//        6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(changeCharToTextReplace(exampleStr));

//         7. *Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        String str4 = "=".repeat(10000);
        long begin = System.currentTimeMillis();
        str4 = str4.replace("=", "равно");
        long end = System.currentTimeMillis();
        System.out.println(end - begin);


        long begin1 = System.currentTimeMillis();
        String str5 = "=".repeat(10000);
        StringBuilder stringBuilder5 = new StringBuilder(str5);
        for (int i = 0; i < str5.length(); i++) {
            stringBuilder5.replace(i, i + 1,"равно");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - begin1);
    }
}
