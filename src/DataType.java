public class DataType {
    public static void main(String[] args) {
        // задание 1.	Написать простой калькулятор – четыре строки,
        // вычисляющие две арифметические операции (+, /).
        // Проверить работу калькулятора на переменных
        // типа int, double. Вопрос: в чем отличие?
        int n1 = 5;
        int n2 = 6;
        int n3 = n1 + n2;
        int n4 = n3 / n1;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);// задание 1
        //задание 2.Дано число 10. Увеличить его на единицу.
        int n5 =10;
        System.out.println(++n5);
        //задание 3.Сделать две проверки (n1 = 10 и n2 = 15):
        // n1 меньше n2, n2 больше 10.
        // Вывести результат на консоль результат двух проверок.
        n1=10;
        n2 = 15;
        boolean b1 = n1<n2;
        System.out.println (b1);
        boolean b2 = n2>10;
        System.out.println (b2);//задание 3
        //4.	Дано число 10. Изменить его
        // знак на противоположный (плюс на минус).
        int f=10;
        f = -f; //задание 4
        //5.	Дана переменная char symbol = ‘A’.
        // Получить символ ‘D’, использую только переменную symbol и
        // не используя другие символы (нельзя написать symbol = ‘D’).
        char c = 'A'+3;
        System.out.println (c);//задание 5
//6.	Найти остаток от деления n1 на n2 (n1 = 5, n2 = 8).
// Объяснить результат в виде комментария.
        float n7 = 5;
        float n8 = 8;
        float n9 = n7%n8;
        System.out.println(n9);
        System.out.println("task 6");

        //Сделать проверку на целое число: является ли
        // оно четным (или нет). Вывести результат (true / false).
        int n10 = 11;
        boolean even = n10%2==0;
        System.out.println(even);//задание 7
    }
}