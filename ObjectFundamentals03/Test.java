package ObjectFundamentals03;


public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = null;
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.height = 4;
        System.out.println("alan1 : " + rectangle1.getArea());


        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println("alan2 : " + rectangle2.getArea());


        Rectangle rectangle3 = rectangle1;
        System.out.println("alan3 : " + rectangle3.getArea());


        rectangle1 = rectangle2;
        System.out.println("alan1 : " + rectangle1.getArea());
        System.out.println("alan3 : " + rectangle3.getArea());


        Rectangle rectangle4 = null;

        //ilkel türler
        int i = 1;
        long l = 2;
        short s = 3;
        byte b = 4;

        float f =3.2f;
        double d =3.2;

        char c ='a';
        char c1 ='3';

        String string ="metin";


    }
}
