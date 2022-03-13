public class Cycle {
    private int upperThreshold;

    public Cycle(int u) {
        if (u > 0) {
            upperThreshold = u;
        }
    }
    public int getUpperThreshold (){
        return upperThreshold;
    }
   public void count() {
        for (int i = 0; i < upperThreshold; i++)
            System.out.print(i + "  ");
    }
}
class Main12 {
    public static void main(String[] args) {
        Cycle cycle1 = new Cycle(9);
cycle1.count();
    }
}


