package Abstract;

public abstract class Employee5 {
    private String name;
    private int age;
    public Employee5(String name, int age){
        this.name=name;
        this.age=age;
    }
    public abstract void work();
    public abstract String writeAReport ();
}
class Doctor extends Employee5{

    public Doctor(String name, int age) {
        super(name, age);
    }
    @Override
    public  void work (){
        System.out.println("I work as a doctor");
    }
    public String writeProgram (){
        return "Program";
    }
    @Override
    public String writeAReport(){
        return "doctor's report";
    }
}
class Programmer extends Employee5{
    public Programmer(String name, int age) {
        super(name, age);
    }
    @Override
    public void work (){
        System.out.println ("I work as a programmer");
    }

    @Override
    public String writeAReport() {
        return "doctor's report";
    }
}