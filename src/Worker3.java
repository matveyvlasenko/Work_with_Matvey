public class Worker3 {
    private char gender;
    private int workExp;

    public Worker3(char g, int wE){
        gender= g;
        workExp=wE;
    }
    public char getGender(){
        return gender;
    }
    public int getWorkExp (){
        return workExp;
    }
}
class Main10 {
    public static void main(String[] args) {
        Worker3 vasya = new Worker3('m',0);
        char gender =vasya.getGender();
        if (gender =='m'){
            System.out.println ("your worker is male");}
            else if (gender == 'f'){
                System.out.println ("your worker is female");}
                else
        {System.out.println ("wrong gender");}
                int workExp = vasya.getWorkExp();
                if (workExp<1){
                    System.out.println ("your worker is a newbie");}
                else if (workExp >1 && workExp<5)
                    {System.out.println  ("your worker is experienced");}
                    else if (workExp>=5)
                        {System.out.println  ("your worker is a senior");
                        }
                    }
                }




