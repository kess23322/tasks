package com.company;

class task3
{

    /*Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
    решения для действительных значений x. учитывая a, b и c, вы должны вернуть
    число решений в уравнение. */

    public static int solutions (int a, int b, int c)
    {
        int D;
        D = b*b - 4*a*c;
        if (D > 0) return 2;
        if (D == 0) return 1;
        return 0;
    }

    /*Напишите функцию, которая возвращает позицию второго вхождения " zip " в
    строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
    быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
    произойти в строке. */

    public static int findZip (String str)
    {
        boolean foundOne = false;
        for (int i = 0; i < str.length() - 2; i++)
        {
            if(str.charAt(i) == 'z' && str.charAt(i+1) == 'i'
                    && str.charAt(i+2) == 'p')
            {
                if (foundOne) return i;
                foundOne = true;
            }
        }
        return -1;
    }

    /*Создайте функцию, которая проверяет, является ли целое число совершенным
    числом или нет. Совершенное число - это число, которое можно записать как
    сумму его множителей, исключая само число.
    Например, 6-это идеальное число, так как 1 + 2 + 3 = 6,
    где 1, 2 и 3-Все коэффициенты 6.
    Точно так же 28-это совершенное число, так как 1 + 2 + 4 + 7 + 14 = 28. */
    public static boolean checkPerfect (int a)
    {
        int sum = 0;
        for (int i = 1; i < a; i++)
        {
            if(a % i == 0) sum +=i;
        }
        return sum == a;
    }

    /*Создайте функцию, которая принимает строку и возвращает новую строку с
    заменой ее первого и последнего символов, за исключением трех условий:
    – Если длина строки меньше двух, верните "несовместимо".".
    – Если первый и последний символы совпадают, верните "два-это пара.". */

    public static String flipEndChars(String str)
    {
        if(str.length() < 2)
        {
            return "Incompatible";
        }
        if(str.charAt(0) == str.charAt(str.length() - 1))
        {
            return "Two is a pair";
        }
        return str.charAt(str.length() - 1) +
                str.substring (1, str.length() - 1) +
                str.charAt(0);
    }


    /* Создайте функцию, которая определяет, является ли строка допустимым
       шестнадцатеричным кодом.
       Шестнадцатеричный код должен начинаться с фунтового ключа #
       и иметь длину ровно 6 символов. Каждый символ должен быть цифрой
       от 0-9 или буквенным символом от A-F.
       все буквенные символы могут быть прописными или строчными. */

    public static boolean isValidHexCode (String code)
    {
        return code.matches("#[a-fA-F0-9]{6}");
    }

    /* Напишите функцию, которая возвращает true, если два массива имеют
       oдинаковое количество уникальных элементов, и false в противном случае.*/

    public static int countUniq(int[] arr)
    {
        boolean[] set =  new boolean[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (set[arr[i]] == false)
            {
                set[arr[i]] = true;
                count++;
            }
        }
        return count;
    }

    public static boolean same (int arr1[], int arr2[])
    {
        return countUniq(arr1) == countUniq(arr2);
    }

    /* Число Капрекара-это положительное целое число, которое после возведения в
       квадрат и разбиения на две лексикографические части равно сумме двух
       полученных новых чисел:
        – Если количество цифр квадратного числа четное, то левая и правая
          части будут иметь одинаковую длину.
        – Если количество цифр квадратного числа нечетно, то правая часть
          будет самой длинной половиной, а левая-самой маленькой или равной
          нулю, если количество цифр равно 1.
        – Учитывая положительное целое число n, реализуйте функцию, которая
          возвращает true, если это число Капрекара, и false, если это не так. */

    public static boolean isKaprekar (int n)
    {
        String str = String.valueOf(n*n);
        if (str.length() == 1)
        {
            return n*n == n;
        }
        return
                Integer.parseInt(str.substring(0, str.length() / 2)) +
                        Integer.parseInt(str.substring (str.length() / 2)) == n;
    }

    /*Напишите функцию, которая возвращает самую длинную последовательность
    последовательных нулей в двоичной строке*/

    public static String longestZero(String str)
    {
        String max = "";
        String cur = "";
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '0')
            {
                cur = cur + "0";
            }
            else
            {
                if (max.length() < cur.length())
                {
                    max = cur;
                }
                cur = "";
            }

        }
        return max;
    }
    /* Если задано целое число, создайте функцию, которая возвращает следующее
      простое число. Если число простое, верните само число. */

    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int num)
    {
        while (!isPrime(num)) num++;
        return num;
    }

    /* Учитывая три числа, x, y и z, определите, являются ли они ребрами
       прямоугольного треугольника. */

    public static boolean rightTriangle(int x, int y, int z)
    {
        return x*x + y*y == z*z || y*y + z*z == x*x || x*x + z*z == y*y;
    }



    public static void main(String[] args) {
        System.out.println(solutions(1, 0, 1) == 0);

        System.out.println(findZip("all zip files are compressed") == -1);

        System.out.println(checkPerfect(97) == false);

        System.out.println(flipEndChars("z").equals("Incompatible"));

        System.out.println(isValidHexCode("CD5C5C") == false);

        System.out.println(same(new int[] {2}, new int[] {3, 3, 3, 3, 3}) == true);

        System.out.println(isKaprekar(297) == true);

        System.out.println(longestZero("11111").equals(""));

        System.out.println(nextPrime(11) == 11);

        System.out.println(rightTriangle(70, 130, 110) == false);
    }

}