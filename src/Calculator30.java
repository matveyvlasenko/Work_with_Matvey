public class Calculator30 {
    public final static double PI=3.14;
    int num1;
    int num2;
    public int sum() {
        return (num1+num2);
    }
    public  int mult () {
        return (num1*num2);
    }
    public double squareOfdif () {
        double dif = num1-num2;
        return (Math.pow(dif,2));
    }
    public int multAlpha (int alpha){
        return ((num1+num2)*alpha);
    }
    public  void part5 (){
        System.out.println((num1*num2)*PI);
    }
}
class Main11{
    public static void main(String[] args) {
        Calculator30 calc1 = new Calculator30();
        calc1.num1=10;
        calc1.num2=20;//нужно обсудить еще раз про задание полей
        //в чем будет разница с заданием параметров метода обсудить еще раз

       int sumResult=calc1.sum();
        System.out.println(sumResult);

       int multResult = calc1.mult();
        System.out.println(multResult);

       double sqResult =calc1.squareOfdif();
        System.out.println(sqResult);

        int multAlphsaresult = calc1.multAlpha(5);
        System.out.println(multAlphsaresult);

        calc1.part5();
    }
}

