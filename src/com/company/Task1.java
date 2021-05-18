package com.company;

class task1
{
    /*
        В Java есть единственный оператор, способный обеспечить остаток от операции
        деления. Два числа передаются в качестве параметров. Первый параметр,
        разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните
        это значение.
    */
    public static int remainder (int x, int y)
    {
        return x%y;
    }
    /*  Напишите функцию, которая принимает основание и высоту треугольника и
        возвращает его площадь.*/
    public static int triArea (int a, int h)
    {
        return a*h/2;
    }
    /*  Фермер подсчитал своих животных, и он дает вам промежуточный итог для каждого
        вида.Вы должны реализовать функцию, которая возвращает общее количество ног
        всех животных.*/
    public static int animals (int chicken, int cow, int pigs)
    {
        return 2*chicken + 4*cow + 4*pigs;
    }
    /*  Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
        возвращает true, если prob * prize > pay; в противном случае
        возвращает false.*/
    public static boolean profitableGamble (double prob, double prize, double pay)
    {
        if (prob * prize > pay)
        {
            return true;
        }
        else return false;
    }
    /*  Напишите функцию, которая принимает 3 числа и возвращает, что нужно сделать
        с a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
        получить N. Если ни одна из операций не может дать N, верните "none".*/
    public static String operation (int N, int a, int b)
    {
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a * b == N) return "multiplied";
        if (a/ b == N) return "divided";
        return "none";
    }
    /*Создайте функцию, которая возвращает значение ASCII переданного символа.*/
    public static int ctoa (char a)
    {
        return (int) a;
    }
    /* Напишите функцию, которая берет последнее число из последовательного
        списка чисел и возвращает сумму всех чисел до него и включая его. */
    public static int addUpTo (int n)
    {
        int i = 1;
        int sum = 0;
        while (i <= n)
        {
            sum = sum +i;
            i=i+1;
        }
        return sum;
    }
    /*Создайте функцию, которая находит максимальное значение третьего ребра
    треугольника, где длины сторон являются целыми числами.*/
    public static int nextEdge (int a, int b)
    {
        return a + b - 1;
    }
    /* Создайте функцию, которая принимает массив чисел и возвращает сумму его
    кубов. */
    public static int sumOfCubes (int array [])
    {
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++)
        {
            sum = sum + (int) Math.pow(array[i], 3);
        }
        return sum;
    }
    /* Создайте функцию, которая будет для данного a, b, c выполнять следующие
           действия:
               – Добавьте A к себе B раз.
               – Проверьте, делится ли результат на C */
    public static boolean abcmath (int a, int b, int c)
    {
        return Math.pow(a,b) % c == 0;
    }

    public static void main(String[] args)
    {

        System.out.println(animals(7,6,5));
    }
}