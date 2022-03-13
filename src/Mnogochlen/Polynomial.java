package Mnogochlen;

import java.util.Scanner;

abstract class Mnogochlen {
    public abstract int evaluate (int x);
}

class Vid1 extends Mnogochlen {
    public int evaluate (int x){
        return x+1;
    }
}
class Vid2 extends Mnogochlen {
    public int evaluate (int x){
        return x*x +x +1;
    }
}
class Vid3 extends Mnogochlen {
    public int evaluate (int x){
        return x*x*x +x*x +x +1;
    }
}


class ArrayCalculator {
    public static int calculateTotalSum (Mnogochlen[] mnogochlens, int x){
        int sum = 0;
        for (Mnogochlen poly:mnogochlens){
            sum +=poly.evaluate(x);
        }
        System.out.println(sum);//здесь можно написать вместе в main?
        return sum;
    }
}
class Main20 {
    public static void main(String[] args) {
        Mnogochlen poly1 = new Vid1();
        Mnogochlen poly2 = new Vid2();
        Mnogochlen poly3 = new Vid3();
        Mnogochlen[] mnogochlens= {poly1,poly2, poly3};
       ArrayCalculator.calculateTotalSum(mnogochlens,4);

    }
}