public class Phone {
    String model;
    int year;
    public Phone (String m, int y) {
        model = m;
        year = y;
    }
    public Phone (String m){
        model = m;
    }
    public void makeCall(){
        System.out.println("Calling...");
    }
    public void printModel (){
        System.out.println (model);
    }
    public void printYear (){
        System.out.println (year);
    }
    public String getModel(){
        return model;
    }
}
class MainClass1{
    public static void main(String[] args) {
        Phone MyPhone = new Phone ("LG", 2018);
        MyPhone.makeCall();
        MyPhone.printYear();
        MyPhone.printModel();
        String model = MyPhone.getModel();
    }
}
