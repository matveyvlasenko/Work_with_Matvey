package Полиморфизм;

import java.util.Scanner;

public abstract class Currency {
    public abstract double toRubles ();
    public abstract void sell ();
}
class Euro extends Currency {
    private double euroRate = 85;

    @Override
    public double toRubles() {
        System.out.println (euroRate*100);
        return euroRate*100;
    }

    @Override
    public void sell() {
        System.out.println ("Euro is sold");
    }
}
class Dollar extends Currency{
    private double dollarRate = 75;
    @Override
    public double toRubles() {
        System.out.println (dollarRate*100);
        return dollarRate*100;
    }

    @Override
    public void sell() {
        System.out.println ("Dollar is sold");
    }
}
class Seller {
    public static void exchange ( Currency currency){
        currency.toRubles();
    }
}
class Main3 {
    public static void main(String[] args) {
        Currency currency1 = new Dollar();
        Currency currency2 = new Euro();
        System.out.println ("Enter currency");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals ("Dollar")) {
        Seller.exchange(currency1);}
        else if (input.equals("Euro"))
        Seller.exchange(currency2);
        else
            System.out.println ("Wrong currency");
    }
}

