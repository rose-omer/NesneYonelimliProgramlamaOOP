package ObjectFundamentals05.Alıstırma;

import ObjectFundamentals05.Alıstırma.geometry.Circle;

import java.util.logging.XMLFormatter;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle =new Circle(3);
        System.out.println("Alan : "+circle.getArea());
        System.out.println("Çevre : "+circle.getPerimeter());

    }
}
