public class personWithThis {
    String name;
    int age;

    public personWithThis(){
    }
    public personWithThis(String name){
        this.name = name;
    }
    public personWithThis(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age =age;}
    public String getName (){return name;}
    public int getAge (){return age;}
}
class Main8{
    public static void main(String[] args) {
        personWithThis vasya = new personWithThis("vasya", 34);
        String name = vasya.getName();
        int age = vasya.getAge();
        vasya.setAge(36);
        vasya.setName("Bob");
    }
}
