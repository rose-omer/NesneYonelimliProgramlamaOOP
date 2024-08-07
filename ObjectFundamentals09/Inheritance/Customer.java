package ObjectFundamentals09.Inheritance;

public class Customer extends Person{

    private long customerId;

    private  double totalDebit;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

    @Override
    public String getFullName () {
        return lastName +" "+firstName;
    }

    @Override
    public String getGreetings() {
        return "selam";
    }


}
