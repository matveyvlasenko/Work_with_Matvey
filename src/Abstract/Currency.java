package Abstract;

public abstract class Currency {
    private double exchangeRate;//поле курса валюты
public Currency (double exchangeRate){
    this.exchangeRate= exchangeRate;//конструктор
}
    public double getExchangeRate (){
    return exchangeRate;//геттер для курса валюты
    }
    public abstract double calculateSum ( double howMany);//метод подсчета суммы
}

class Dollar extends Currency {
   public Dollar (double exchangeRate){//конструктор для доллар
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
Dollar dollar1 = new Dollar (75);
Euro euro1 = new Euro (85);
dollar1.calculateSum(200);
euro1.calculateSum(300);
    }
}

