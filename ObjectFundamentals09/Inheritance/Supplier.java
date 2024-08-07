package ObjectFundamentals09.Inheritance;

public class Supplier  extends Person{
    private long supplierId;

    private  String mainSector;

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getMainSector() {
        return mainSector;
    }

    public void setMainSector(String mainSector) {
        this.mainSector = mainSector;
    }

    @Override
    public String getGreetings() {
        return "naber";
    }
}


