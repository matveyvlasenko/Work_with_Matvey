import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //12.	Дан массив положительных и отрицательных чисел.
        // Найти максимальное количество идущих подряд положительных чисел.
        int[] arr19 = new int[]{11, -2, -3, -4, 5, 10, 6, 7, -9};
        int positiveNumbers = 0;
        int maxCount = 0;
        for (int i = 0; i < arr19.length; i++) {
            if (arr19[i] > 0) {
                positiveNumbers++;
            }
            if (arr19[i] <= 0 || i == arr19.length - 1) {
                if (positiveNumbers > maxCount) {
                    maxCount = positiveNumbers;
                }
                positiveNumbers = 0;
            }
        }
        System.out.print(maxCount);
        System.out.println("    12 task");

        int[] arr21 = new int[]{11, 6, -4, 5, 10, 6, 7, -9, 1, 2, 3};
        int positiveNumbers2 = 0; //1   4
        int maxCount2 = 0; //1,   1 < 4?   ->  4
        for (int i = 0; i < arr21.length; i++) {
            if (arr21[i] > 0) {
                positiveNumbers++;

                if (positiveNumbers2 > maxCount2) {
                    maxCount2 = positiveNumbers2;
                }
            } else { //<= 0
                positiveNumbers2 = 0;
            }
        }
        System.out.println(maxCount2);
        System.out.println("  12 task again");



    //1.Создать массив двумя способами. Вывести на консоль все элементы массива (for each и for).
            int[] arr1 = {5, 10, 15, 20};
            for (int num : arr1) {
                System.out.print(num + " ");
            }
            System.out.println("1st task");

            int[] arr11 = {5, 10, 15, 20};
            for (int i = 0; i < arr11.length; i++) {
                System.out.print(arr11[i] + " ");
            }
            System.out.println("1.1 task");

//2.	Заполнить массив следующей последовательностью: 0, 2, 4, 6, 8..
            int[] arr2 = new int[10];//10 элементов в массиве
            for (int i = 0; i < arr2.length; i++) {//
                arr2[i] = i * 2;
            }
            for (int num : arr2) {
                System.out.print(num + " ");
            }
            System.out.println("2nd task");

            //3.Заполнить массив любыми числами. Посчитать сумму всех элементов массив.
            int[] array = {10, 30, 20, 50, 40, 10};
            int sum = 0;
            for (int num : array) {
                sum = sum + num;
            }
            System.out.print("sum = " + sum + " ");
            System.out.println("3rd task");


            //4.	Создать массив типа String. Сохранить следующие значения: 1, 2, 3, 4.
            // Посчитать сумму такого массива (int).
            String[] stringArray = {"1", "наследование", "3", "4"};
            int sum4 = 0;
            for (String str : stringArray) {
                int result = Integer.parseInt(str);
                sum4 = sum4 + result;
            }
            System.out.println(sum4 + " this is task 4");

//5.	Пользователь вводит число. Создать массив, размер которого равен введенному числу.
// Заполнить массив числами: 0, 1, 2, 3, 4 …
            int[] arr5;
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            arr5 = new int[n];
            for (int i = 0; i < n; i++) {
                arr5[i] = i;
                System.out.print(arr5[i] + " ");
            }
            System.out.println(" this is task 5");
            //6.Дан массив, заполненный любыми числами. Найти среднее значение элементов массива.
            int[] arr6 = {100, 100, 100, 100, 7};
            double sum9 = 0;
            for (int num : arr6) {
                sum9 = sum9 + num;
            }
            int length = arr6.length;
            double aritMean = sum9 / length;
            System.out.println(" sum9 =" + sum9);
            System.out.println("length=" + length);
            System.out.println("aritMean =" + aritMean);
            System.out.println("6th task");

//7. Развернуть массив. Пример: дан массив 1 2 3 4 5. Результат решения: 5 4 3 2 1.
            int[] arr7 = {1, 2, 3, 4, 5};
            int[] arr71 = new int[5];
            int i7 = 0;
            for (int i = 0; i < arr7.length; i++) {
                arr71[i7] = arr7[arr7.length - i - 1];
                i7++;
                System.out.print(arr71[i] + " ");
            }
            System.out.println("7th task");

            //8.	*Если 7 пункт решен с использованием второго массива (вспомогательного),
            // то решить программу только с помощью одного массива.
            int[] arr8 = {1, 2, 3, 4, 5};
            int i8 = 0;
            for (int i = 0; i < arr8.length / 2; i++) {
                int temp = arr8[i];
                arr8[i] = arr8[arr8.length - 1 - i8];
                arr8[arr8.length - 1 - i8] = temp;
                i8++;

                for (int num : arr8) {
                    System.out.print(num + " ");
                }
                System.out.println("8th task");//
            }//пройти еще раз, не понимаб


            //9 task 	Пользователь вводит число.
            // Определить, содержится ли число в массиве. Если содержится, то какое количество.
            int[] arr9 = new int[]{1, 7, 3, 4, 5, 5, 5};
            boolean found = false;
            Scanner scanner2 = new Scanner(System.in);
            int searchedValue = scanner.nextInt();
            int i9 = 0;
            for (int i = 0; i < arr9.length; i++) {
                if (arr9[i] == searchedValue) {
                    found = true;
                    i9++;
                }
            }
            System.out.println(found);
            System.out.println("found " + i9 + " times" + "    task 9");

            //task 10 	Написать программу заполнения массива с консоли.
            int[] arr10 = new int[5];
            Scanner scanner10 = new Scanner(System.in);

            for (int i = 0; i < arr10.length; i++) {
                int n10 = scanner.nextInt();
                arr10[i] = n10;
            }
            for (int num : arr10) {
                System.out.print(num + " ");
            }
            System.out.println("10th task");

        //11 task
        int[] arr14 = new int[]{11, 2, 3, 4, 5, 10, 6, 7};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr14.length; i++) {
            if (max < arr14[i]) {
                max = arr14[i];
            }
        }
        System.out.println(max);

        int[] arr18 = new int[]{11, 2, 3, 4, 5, 10, 6, 7};
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr18.length; i++) {
            if (min>arr18[i] ) {
                min = arr18[i];
            }
        }
        System.out.println(min);



            //13 task
            int[] arr12 = {8, 9, 17, 123, 5, 2, 0, 10, 7};
            int sum8 = 0;
            int previousSum = 0;
            for (int i = 0; sum8 < 100; i++) {
                previousSum = sum8;
                sum8 = sum8 + arr12[i];//
            }
            System.out.println(previousSum);
            System.out.println("13th task");

            //14th task
            int[][] multarray = new int[3][3];
            for (int i = 0; i < 3; i++) {  //заполняем по строкам
                for (int j = 0; j < 3; j++) {//заполняем по столбцам
                    multarray[i][j] = i * 3 + j;
                }
            }
            for (int i = 0; i < 3; i++) {  //идём по строкам
                for (int j = 0; j < 3; j++) {//идём по столбцам
                    System.out.print(" " + multarray[i][j] + " "); //вывод элемента
                }
                System.out.println();
            }
            System.out.println("task 14");


        }
    }


