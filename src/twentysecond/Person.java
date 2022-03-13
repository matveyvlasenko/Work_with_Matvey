package twentysecond;

public class Person {
    String name;
    public Person (String name){
        this.name = name;
        printInfo();
    }
    public void printInfo(){
        System.out.println (name.toUpperCase());
    }
}
class Employee extends Person{
    String job;

    public Employee(String name, String job){
        super(name);
        this.job = job;
    }
    public void printInfo (){
        System.out.println(
                name.toUpperCase() + " "+ job.toUpperCase());
    }
}