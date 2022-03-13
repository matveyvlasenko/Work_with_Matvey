public class Worker {
     private int age;
    private String name;

public void setAge (int a){
    if (a >=0) {
        age = a;}
}
public int getAge (){
    return age;
}
public void setName (String n){
name =n;
}
public String getName(){
    return name;
}
}
class Main6 {
    public static void main(String[] args) {
        Worker Vasya = new Worker();
        Vasya.setAge(3);
        int age =Vasya.getAge();
        Vasya.setName("Petya");
        String name = Vasya.getName();
System.out.println (name);
        System.out.println (age);
    }
}


