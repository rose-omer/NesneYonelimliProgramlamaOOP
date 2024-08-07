package ObjectFundamentals12.StaticsVeFınal;

public class BankAccount {
   private double investment;
   private static  double rate ;

   public final static int MounthCount=12;
    public double getInvestment() {
        return investment;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double getAmount(int mounth){
        return investment*(1+mounth*rate/100);

    }

    public double getAmount(){
        return getAmount(MounthCount);

    }
}
