package ObjectFundamentals05.Encapsulation;

import ObjectFundamentals05.Encapsulation.geometry.Rectangle;



public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(-3);
        System.out.println("Alan "+rectangle.getArea());
        System.out.println("Çevre "+rectangle.getPerimeter());
    }


}
