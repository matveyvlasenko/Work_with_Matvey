package наследование;

public class Employee4 {
    private String name;
    private int we;
    public Employee4 (String name, int we){
        this.name =name;
        this.we=we;
    }
    public String getName(){
        return name;
    }
    public int getWe(){
        return we;
    }

    public void printInfo (){
        System.out.println (name +" "+ we);
    }
}
 class Doctor extends Employee4{
    private String specialization;
    public Doctor (String name, int we, String specialization){
        super (name,we);
        this.specialization=specialization;
    }
     @Override
     public void printInfo (){
         System.out.println (getName() +" "+ getWe() +" " +specialization);
     }
 }
 class Programmer extends Employee4{
    private String language;
    public Programmer (String name, int we, String language){
        super (name, we);
        this.language=language;
    }
     @Override
     public void printInfo (){
         System.out.println (getName() +" "+ getWe()+ " " + language);
     }
 }
 class Main04 {
     public static void main(String[] args) {
         Employee4 empl1= new Employee4("Rob",3);
         Doctor doc1 = new Doctor ("Bob",4, "Surgeon");
         Programmer Nick = new Programmer("Nick", 3, "Java");
         empl1.printInfo();
         doc1.printInfo();
         Nick.printInfo();
     }
 }
