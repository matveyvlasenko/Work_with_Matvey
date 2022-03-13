public class Employee {
    private String name;
    private int age;
    private int workExperience;

    public Employee(String n, int a, int we) {
        if (a > 0 && a < 100) {
            age=a;
        }
        if (we >= 0) {
             workExperience=we;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWe() {
        return workExperience;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a) {
        if (a > 0 &&a<100){
            age = a;
        }
    }
        public void setExp(int we){
            if (we>=0){
                workExperience=we;
            }
        }
    }
    class main7{
        public static void main(String[] args) {
            Employee vasya = new Employee("Vasya", 51,23);
            vasya.setName("Peter");
            vasya.setAge(+3);
            vasya.setExp(3);
            String name = vasya.getName();
            int age = vasya.getAge();
            int workExperience = vasya.getWe();
            System.out.println (name);
            System.out.println (age);
            System.out.println (workExperience);
        }
    }

