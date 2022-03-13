package Полиморфизм;

public class Employee {
    private String name;
    private int workExperience;

    public Employee(String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
    }

    public void printInfo(){
        System.out.println(name + " " + workExperience);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(name + " " + age);
    }
}

class Printer {

    //для вызова метода сначала создаем объект класс Human
    //при вызове передаем в круглые скобки созданный объект
    //Далее можем использовать данный объект в нашем методе

    //Здесь название можем быть любое (human, h, hum) - без разницы,
    //параметр метода можем называть как угодно. Главное правильно
    //указать тип параметра (Human с большой буквы - это наш класс).
    public static void printHumanInfo(Human human){
        //работаем с объектом
        human.printInfo();
    }


    //Аналогично для объекта класса Employee
    public static void printEmployeeInfo(Employee employee){
        //работаем с объектом
        employee.printInfo();
    }
}


class MainEmployee {
    public static void main(String[] args) {
        //Создаем объекты классов
        Human human = new Human("Bob", 20);
        Employee employee = new Employee("Mike", 4);


        //Передаем объекты в качестве параметров метода
        Printer.printHumanInfo(human);
        Printer.printEmployeeInfo(employee);
    }
}


