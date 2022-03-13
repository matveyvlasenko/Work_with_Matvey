public class Utils {
    static int arraySum(int[] n1) {
        int sum = 0;
        for (int num : n1) {
            sum = sum + num;
        }
        return sum;
    }
 static double sq1( double n2){
        double square = n2*n2;
        return square;
}
  static String convert (int n3){
    String s = Integer.toString(n3);
    return s;
}
 static boolean checkRange (int n4){//означает ли private что метод можно вызывать?
        boolean lessthan100 = n4>=0&& n4<=100;
        return lessthan100;
        //if (n4>=0 && n4<=100)
    }//не понимаю в чем разница между условие писать в boolean или
    //внутри скобок, как можно сделать по другому?
}
class Main24{
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        Utils.arraySum(arr);//как передавать массив в качестве параметра?
        Utils.sq1(3);
        Utils.convert(7);
        Utils.checkRange(17);
    }
}
