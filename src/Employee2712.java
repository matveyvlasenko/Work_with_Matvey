//1.	Создать класс Employee. Добавить поля: имя, стаж работы, отдел.
//2.	Добавить два конструктора: первый для задания имени и отдела.
// Второй – для всех трех полей.
//3.	Добавить в класс следующую логику: необходимо подсчитывать,
// какое количество объектов создается (подсчитывать нужно в классе, а не в меине).
//4.	Создать 5 объектов. Проверить, что логика из 3 пункта работает.
//5.	Добавить общий для всех работников метод: подсчитать прибыль компании
// (прибыль компании передается в метод в качестве параметра – массив double).


public class Employee2712 {
    private static int numberOfObjects =0;
    private String name;
    private int workExperience;
    private String department;

    public Employee2712(String name, String department) {
        this.name = name;
        this.department = department;
        numberOfObjects++;
    }
    public Employee2712(String name, int workExperience, String department) {
        this.name = name;
        this.department = department;
        this.workExperience = workExperience;
        numberOfObjects++;
    }
    public static  int getNumberOfObjects(){     // getter
        return numberOfObjects;
    }
    public static void calculateProfit (int[] profit){
        System.out.println ("Прибыль посчитана");
    }
}
    class Main {
    public static void main(String[] args) {
    Employee2712 emp1 = new Employee2712("Vasya","marketing");
    Employee2712 emp2 = new Employee2712("Bob",34, "Accounting");
    Employee2712 emp3 = new Employee2712("Rob", "Accounting");
    Employee2712 emp4 = new Employee2712("Bob", "Accounting");
    Employee2712 emp5 = new Employee2712("Alex",7, "Accounting");
    System.out.println (emp1);
    System.out.println (emp2);
    System.out.println (emp3);
    System.out.println (emp4);
    System.out.println (emp5);
    System.out.println (Employee2712.getNumberOfObjects());
    int [] profit = {10,20,30};
    Employee2712.calculateProfit(profit);
        }
        }

