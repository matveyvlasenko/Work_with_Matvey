public class Person2 {//класс
    private String name;//первое поле
    private int age;//второе поле

    public Person2 (String n, int a){//конструктор
        name = n;
        age = a;
    }
    public int getAge (){//getter
        return age;
    }
    public String getName (){//getter
        return name;
    }
}

class Main17 {
    public static void main(String[] args) {
        Person2 vasya = new Person2 ("Vasya",38);
          int a = vasya.getAge();
          String name = vasya.getName();
          if (a<18&& a>=0){
              System.out.println (name + " is a minor");
          }
          else if (a>18&& a<60){
              System.out.println (name + " is an adult");
          }
          else {
              System.out.println (name + "is an elderly person");
          }
    }
}
