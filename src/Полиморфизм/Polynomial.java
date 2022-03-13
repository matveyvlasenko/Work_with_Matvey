package Полиморфизм;

import java.util.Scanner;

public abstract class Polynomial {
public abstract int evaluate (int x);
}

class Poly1 extends Polynomial{
    public int evaluate (int x){
        return x+1;
    }
}
class Poly2 extends Polynomial{
    public int evaluate (int x){
        return x*x +x +1;
    }
}
class Poly3 extends Polynomial{
    public int evaluate (int x){
        return x*x*x +x*x +x +1;
    }
}
 class FormulaCalculator {
    public static void evaluate(Polynomial poly, int x){
poly.evaluate(x);
}
}

class ArrayCalculator {
    public static void calculateTotalSum (Polynomial[] polynomials, int x){
        int sum = 0;
        for (Polynomial poly:polynomials){
            sum +=poly.evaluate(x);
        }
    }
}
class Main20 {
    public static void main(String[] args) {
        Polynomial poly1 = new Poly1();
        Polynomial poly2 = new Poly2();
        Polynomial poly3 = new Poly3();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            FormulaCalculator.evaluate(poly1,5);
        } else if (choice == 2) {
            FormulaCalculator.evaluate(poly2,6);
        } else if (choice == 3) {
            FormulaCalculator.evaluate(poly3,7);
        } else {
            System.out.println("wrong choice");
        }
    }
}