package ObjectFundamentals10.Interface;

public class Test {
    private  static  void makeFly(Flyable flyable){
        System.out.println();
        System.out.println("uç");
        flyable.Fly();
        System.out.println("kon");
        flyable.land();

    }
    public static void main(String[] args) {
        Piguen piguen = new Piguen("TAKLACI  ");
        piguen.Fly();
        piguen.land();

        Flyable flyable = new Piguen("Postacı  ");
        flyable.Fly();
        flyable.land();

        Bat bat = new Bat("Dark knight ");
        bat.Fly();
        bat.land();

        //Mammal mammal = new Mammal("memeli");


        makeFly(piguen);

        Hawk hawk = new Hawk("Şahin  ");
        hawk.Fly();
        hawk.land();


        makeFly(hawk);
    }
}