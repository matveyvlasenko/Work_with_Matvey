public class Person {
    String name;
    int age;
    public Person (String nm, int ag){
        name = nm;
        age = ag;}
public void printInfo () {
    System.out.println(name + age);
}
    public int getAge(){
        return age;
    }
}
class MainClass2{
public static void main(String[] args){
Person vasya = new Person("Vasya", 0);
Person kolya = new Person("Kolya", 0);
Person petya = new Person("Petya", 100);
int vasyaAge = vasya.getAge();
int kolyaAge = kolya.getAge();
int petyaAge = petya.getAge();
double averageAge = ((vasyaAge+kolyaAge+petyaAge)/3.0);
        System.out.println(averageAge);
}
}
