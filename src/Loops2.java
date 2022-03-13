public class Loops2 {
    public static void main(String[] args) {
        //1.	Вывести на консоль 10, 13, 16, 19, 22, 25 (6 чисел) с помощью цикла.
        for (int i = 10; i <= 25; i = i + 3)
            System.out.print(i + " ");
        System.out.println("1st task");

//      2.Вывести на консоль 10 элементов последовательности: 0, 1, 3, 6, 10, 15…
        int k = 0;
        for (int i = 0; i <= 10; i++) {
            k = k + i;
            System.out.print(k + " ");
        }
        System.out.println("2nd task");

        // 3.	Возвести 3 в 10 степень с помощью цикла.
        int q = 3;
        int w = 3;
        for (int i = 0; i < 10; i = i + 1) {
            System.out.print(q + " ");
            q = q * w;
        }
        System.out.println("3rd task");


        //4.	Дана последовательность 1, 2, 3,4,5 …. Считать сумму элементов этой
        // последовательности до тех пор, пока значение суммы меньше 100.
        int sum = 1;
        for (int i = 0; sum < 100; i++) {//правильно ли начинать с i=1 или sum =1?
            System.out.print(sum + " ");//поменял местами 24 и 25 строчку,
            // до этого было 105, почему?
            sum = sum + i;
        }
        System.out.println("4th task");

//5.	Дана последовательность 1, 2, 4, 8, 16, 32…
// Найти первое число, которое больше 100 (вывести его на консоль).
        int e = 1;
        for (int i = 0; e <= 100; i++) {
            e = e * 2;
        }
        System.out.println(e);
    }
}

