public class Matrix {
    public static void main(String[] args) {
        //task 1 1.	Создать матрицу 3 на 4. Заполнить ее последовательностью 1, 2, 3,
        int[][] matr1 = new int[4][3];
        int count = 1;
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[0].length; j++) {
                matr1[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[0].length; j++) {
                System.out.print(matr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
//task 2 2.	Получить и вывести на консоль первый элемент матрицы.
        System.out.println(matr1[0][0]);


            System.out.println(matr1[matr1.length - 1][matr1[0].length - 1]);//task 3
        // Получить и вывести на консоль последний элемент
    //матрицы: индекс строки и столбца необходимо получить с помощью .length


            System.out.println(matr1[matr1.length - 1][0]);//task 4.
        // Получить и вывести на консоль первый элемент последней строки.

            System.out.println(matr1[0][matr1[0].length - 2]);//task 5.
        // Получить предпоследний элемент первой строки в матрице.

        //task 6.	Перебрать (циклом) первую строку матрицы.
        for (int j = 0; j < matr1[0].length; j++) {
            System.out.print(matr1[0][j] + " ");//так как строка первая, номер строки ноль.
            //перебирать элементы в строке с помощью j
        }
        System.out.println();
        System.out.println("task 6");

        //task 7 7.	Перебрать (циклом) последнюю строку матрицы.
        for (int j = 0; j < matr1[0].length; j++) {
            System.out.print(matr1[matr1.length-1][j] + " ");
        }
        System.out.println();
        System.out.println("task 7");

        //task 8 Перебрать первый столбец матрицы (без цикла, вручную).
        System.out.println(matr1[0][0]);
        System.out.println(matr1[1][0]);
        System.out.println(matr1[2][0]);


        //task 9 На основании найденной закономерности попробовать
        // решить 8 задачу с помощью цикла (перебрать столбец матрицы с помощью цикла).
        for (int i = 0; i < matr1.length; i++) {
            System.out.print(matr1[i][0] + " ");
        }
        System.out.println();
        System.out.println("task 9");
        }
    }

