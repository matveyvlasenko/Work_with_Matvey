public class Person30Jan {
    int age;
    String name;

    public boolean ageCheck (){
        boolean isAdult = (age>=18);
        return isAdult;
    }

    public String occupCheck (){
        String age1="preschool";
        String age2="school";
        String age3="student";
        String age4="work";
        String age5="retired";
        if (age<7){
            return age1;
        }
        else if (age>=7&& age<18){
            return age2;
        }
        else if (age>=18&& age<23){
            return age3;
        }
        else if (age>=23&& age<65){
            return age4;
        }
        else  {
            return age5;
        }
    }
    public void printinfo(){
        System.out.println (name);
        System.out.println (age);
    }

}

class Main30 {
    public static void main(String[] args) {
        Person p = new Person("Mike",10);
        p.age =10;
        p.name = "Mike";
    }
}








