package ObjectFundamentals03;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 3;
        Integer w = new Integer(i);
        int iw = w.intValue();
        System.out.println("ilkel , sınıf ilkel "+i+" "+w+" "+i);

        String s =Integer.toString(i);
        String s2 ="123";
        int is =Integer.parseInt(s2);
        System.out.println("katar , katar 2 , ilkel "+s+" "+s2+" "+is);

        Integer bw=1;
        int bi =w;
        System.out.println("Kutulu , Kutusuz  "+bw+" "+bi);



    }
}
