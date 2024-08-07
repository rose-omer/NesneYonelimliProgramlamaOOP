package ObjectFundamentals12.StaticsVeFınal;

public class Test {
    public static void main(String[] args) {
        BankAccount.setRate(12);
        BankAccount bankAccount1=new BankAccount();
        bankAccount1.setInvestment(300);
        double amount =bankAccount1.getAmount(6);
        System.out.println("tutar "+ amount);



        BankAccount.setRate(24);
        BankAccount bankAccount2=new BankAccount();
        bankAccount2.setInvestment(500);
        double amount2 =bankAccount2.getAmount(12);
        System.out.println("tutar "+ amount2);




        BankAccount.setRate(9);
        BankAccount bankAccount3=new BankAccount();
        bankAccount3.setInvestment(800);
        double amount3 =bankAccount3.getAmount();
        System.out.println("tutar "+ amount3);


       // BankAccount.MounthCount=23;
    }
}
