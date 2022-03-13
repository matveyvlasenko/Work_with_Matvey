//1.	Создать класс Человек. Добавить поля: имя, возраст.
//2.	Добавить два конструктора: первый для задания имени и возраста.
// Второй для задания только имени.
//3.	Добавить в программу следующую логику: если возраст не задается (второй конструктор),
// то в поле Возраст необходимо записывать возраст по умолчанию (20).
//4.	Добавить метод, проверяющий человека на совершеннолетие (boolean isAdult() ).


public class Person3 {
    String name;
    int age;
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static final int DEFAULT_AGE=20;
    public Person3(String name) {
        this.name = name;
        this.age =DEFAULT_AGE;
    }
    public void adultCheck() {
        boolean isAdult = (age >= 18);
        if (isAdult) {
            System.out.println("Adult");
        }
    }
}