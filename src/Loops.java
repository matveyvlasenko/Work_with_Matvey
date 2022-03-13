public class Loops {
    public static void main(String[] args) {
        //1.	Создайте программу, выводящую на экран первые
        // 20 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int k = 1;
        for(int i=0; i<20; i++){
            System.out.print(k + " ");
            k = k + 2;
        }
        System.out.println(" 1st task");



// 2.	Вывести на консоль только четные числа.
        int l = 0;
        for(int i=0; i<20; i++){
            System.out.print(l + " ");
            l = l + 2;
        }
        System.out.println(" 2nd task");

        //3.	Создайте программу, выводящую на экран первые 20 элементов
        // последовательности 2 4 8 16 32 64 128 ….
        int mul = 2;
        for(int i=0; i<20; i++){
            System.out.print(mul + " ");
            mul = mul * 2;

        }
        System.out.println(" 3rd task");
        //задание 4
        // Вывести на консоль все числа от 0 до 100, не включая 4 и 13.
        // Реализовать программу двумя способами.

        for (int i =0; i <=100;i++)
        {if (i ==4||i ==13)
        {continue;}
            System.out.print(i+" ");//задание 4-1
        }
        System.out.println(" 4-1 task");

        for (int i =0; i <=100;i++)
        {if (i !=4&&i !=13)
            System.out.print(i+" ");}//задание 4-2
        System.out.println(" 4-2 task");
        //задание 5.	Вывести на консоль таблицу 4на5,
        // состоящую из «+». (четыре строки по пять плюсов в каждой).
        for (int i=0; i <4; i++){
            for (int j=0;j<5;j++){
                System.out.print("+");
            }
            System.out.println();
        } System.out.println("5th task");

        //6.Вывести на консоль таблицу умножения.

        for (int i=1; i<10;i++){
            for (int j=1; j<10; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        System.out.println("6th task");

//Дана сумма вклада, процент, на который увеличивается вклад каждый год,
// а также срок вклада (три переменные). Посчитать общую сумму денег, которую получит
// клиент по истечении всего срока вклада.
// Например: вклад 100 Р, ставка 7% -> через год будет 107 Р и так далее.
        int initialSum=100;//начальная сумма
        int years = 8;//на сколько лет разместили
        double annualInterest =1.07;//процент
        double finalSum = initialSum;//сумма в конце каждого года
        //i - на сколько лет разместили
        for (int i=0; i<years; i=i+1){
            finalSum = annualInterest*finalSum;
    System.out.println (finalSum);}//7 задание
        System.out.println("7th task");

//task 8.Посчитать сумму чисел от 0 до 100.
        int sum = 0;
        for (int i=0; i<=100;i++) {
            sum = sum + i;
        }
        System.out.println(sum);//8 задание
        System.out.println("8th task");

        //9 Посчитать сумму четных чисел от 0 до 100.
        int sum2 = 0;
        for (int i=0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println (sum2);
        System.out.println("9th task");
       //10.	Посчитать сумму четных чисел без использования if.
        int sum3 = 0;
        for (int i=0; i <=100; i++){
            sum3= sum3+2;
        }

//11.	Написать цикл, вычисляющий факториал числа
// (про факториал можно посмотреть в гугле).
        int n = 6;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
            System.out.println(s);
        }//задание 11
    }
}