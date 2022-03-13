public class Calculator {
    int firstTerm;
    int secondTerm;

    public Calculator(int fi, int sec) {
        firstTerm = fi;
        secondTerm = sec;
    }

    public Calculator(int fi) {
        firstTerm = fi;
        secondTerm = fi;
    }

    public void printFirstTerm() {
        System.out.println(firstTerm);
    }

    public void printSecondTerm() {
        System.out.println(secondTerm);
    }

    int add() {
        return (firstTerm + secondTerm);
    }
}
class MainClass3 {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(3, 4);
        Calculator myCalculator2 = new Calculator(1, 9);

        int sum = myCalculator.add();
        myCalculator.printFirstTerm();
        myCalculator.printSecondTerm();
        System.out.println(sum);

        int sum2 = myCalculator2.add();
        myCalculator2.printFirstTerm();
        myCalculator2.printSecondTerm();
        System.out.println(sum2);

    }
}

