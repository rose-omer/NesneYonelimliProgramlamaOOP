package ObjectFundamentals13;

public class Test {

    public static void main(String[] args) {
        Days bugun = Days.CUMA;

        switch (bugun) {
            case PAZARTESI:
                System.out.println("Bugün Pazartesi");
                break;
            case SALI:
                System.out.println("Bugün Salı");
                break;
            case CARSAMBA:
                System.out.println("Bugün Çarşamba");
                break;
            case PERSEMBE:
                System.out.println("Bugün Perşembe");
                break;
            case CUMA:
                System.out.println("Bugün Cuma");
                break;
            case CUMARTESI:
                System.out.println("Bugün Cumartesi");
                break;
            case PAZAR:
                System.out.println("Bugün Pazar");
                break;
        }
        System.out.println("Bugün " + bugun + " ve İngilizcesi " + bugun.getEnglishName());




    }
}

