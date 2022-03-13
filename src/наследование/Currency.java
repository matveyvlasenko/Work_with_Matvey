package наследование;

public class Currency {
    private double exchangeRate;
public Currency (double exchangeRate){
    this.exchangeRate= exchangeRate;
}
public double calculateSum ( double howMany){
    return howMany *exchangeRate;
}
    public double getExchangeRate (){
        return exchangeRate;
    }
}
 class Dollar extends Currency {
    public Dollar (double exchangeRate){
        super(exchangeRate);
    }
    @Override
    public double calculateSum (double howMany){
        return howMany*getExchangeRate();
    }
}
class Euro extends Currency {
    public Euro (double exchangeRate){
        super(exchangeRate);
    }
    @Override
    public double calculateSum (double howMany){
        return howMany*getExchangeRate();
    }
}
class Main {
    public static void main(String[] args) {
Currency cur1 = new Currency(6);
Dollar dollar1 = new Dollar (75);
Euro euro1 = new Euro (85);
dollar1.calculateSum(200);
euro1.calculateSum(300);

    }
}

