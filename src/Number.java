public class Number {
     int firstNum;
    public Number(int a) {
        if (a >=-100&& a <=100)
        {firstNum = a;}
        else {firstNum=a;}
    }
    public void setFirstNum(int a) {
        if (a >=-100&& a <=100){
            firstNum= a;}
        else {firstNum=-100;}
        }

    public int getFirstNum (){
            return firstNum;
        }
}
class Main5 {
    public static void main(String[] args) {
        Number firstNum = new Number(30);
        firstNum.setFirstNum(-10);
        int f =firstNum.getFirstNum();
        System.out.println(f);
    }
}
