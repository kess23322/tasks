package com.company;

import java.util.Arrays;

class task2 {
    /* Создайте функцию, которая повторяет каждый символ в строке n раз. */
    public static String repeat(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < n; j++) {
                result = result + str.charAt(i);
            }
        return result;
    }
    /* Создайте функцию, которая принимает массив и возвращает разницу между
    самыми большими и самыми маленькими числами. */
    public static int differenceMaxMin(int array[])
    {
        int max = array[0];
        int min = array[0];
        //int n = array.lenght
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        return max - min;
    }
    /* Создайте функцию, которая принимает массив в качестве аргумента и
    возвращает true или false в зависимости от того, является ли среднее
    значение всех элементов массива целым числом или нет. */
    public static boolean isAvgWhole(int a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum % a.length == 0;
    }
    /* Создайте метод, который берет массив целых чисел и возвращает массив, в
    котором каждое целое число является суммой самого себя + всех предыдущих
    чисел в массиве. */
    public static int[] cumulativeSum(int a[]) {
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i] + a[i - 1];
        }
        return a;
    }
    /* Создайте функцию, которая возвращает число десятичных знаков, которое имеет
    число (заданное в виде строки). Любые нули после десятичной точки
    отсчитываются в сторону количества десятичных знаков. */
    public static int getDecimalPlaces(String number) {
        if (number.indexOf('.') != -1) {
            return number.length() - number.indexOf('.') - 1;
        }
        return 0;
    }
    /* Создайте функцию, которая при заданном числе возвращает соответствующее
    число Фибоначчи. */
    public static int Fibonacci(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n > 1)
        {
            return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
        else
        {
            return Fibonacci(n + 2) - Fibonacci(n + 1);
        }

    }
    /* Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
    напишите функцию, чтобы определить, является ли вход действительным
    почтовым индексом. Действительный почтовый индекс выглядит следующим
    образом:
     – Должно содержать только цифры (не допускается использование
       нецифровых цифр).
     – Не должно содержать никаких пробелов.
     – Длина не должна превышать 5 цифр. */
    public static boolean isValid(String index) {
        if (index.length() != 5) return false;
        for (int i = 0; i < index.length(); i++)
            if (48 > index.charAt(i) || 57 < index.charAt(i)) {
                return false;
            }
        return true;
    }
    /* Пара строк образует странную пару, если оба из следующих условий истинны:
        – Первая буква 1-й строки = последняя буква 2-й строки.
        – Последняя буква 1-й строки = первая буква 2-й строки.
        – Создайте функцию, которая возвращает true, если пара строк
          представляет собой странную пару, и false в противном случае. */
    public static boolean isStrangePair (String str1, String str2)
    {
        return str1.length() == 0 || str2.length() == 0 ||
                (str1.charAt(0) == str2.charAt(str2.length() - 1) &&
                        str1.charAt(str1.length() - 1 ) == str2.charAt(0));
    }
    /* Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
        – isPrefix должен возвращать true, если он начинается с
          префиксного аргумента.
        – isSuffix должен возвращать true, если он заканчивается
          аргументом суффикса.
        – В противном случае верните false. */
    public static boolean isPrefix (String word, String pref)
    {
        pref =  pref = pref.substring(0, pref.length() - 1);
        return word.startsWith(pref);
    }
    public static boolean isSuffix(String word, String suf)
    {
        suf = suf.substring(1);
        return word.endsWith(suf);
    }
    public static int boxSeq (int step)
    {
        return step + 2*(step % 2);
    }
    public static void main(String[] args) {
        System.out.println(repeat("stop", 2).equals("ssttoopp"));

        System.out.println(differenceMaxMin(new int[] {44, 32, 86, 19})==67);

        System.out.println(isAvgWhole(new int[] {9, 2, 2, 5})==false);

        System.out.println(Arrays.equals(
                cumulativeSum(new int[] {1, -2, 3}),
                new int[] {1, -1, 2}));

        System.out.println(getDecimalPlaces("3.1")==1);

        System.out.println(Fibonacci(12) == 233);

        System.out.println(isValid("393939") == false);

        System.out.println(isStrangePair("", "") == true);

        System.out.println(isSuffix("vocation", "-logy") == false);

        System.out.println(boxSeq(2) == 2);
    }
}