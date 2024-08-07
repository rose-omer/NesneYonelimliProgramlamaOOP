package ObjectFundamentals02.contractor;


public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
       // rectangle.width = 13;
        //rectangle.height = 14;
        System.out.println("Alan : " + rectangle.getArea());
        System.out.println("Çevre : " + rectangle.getPerimeter());
    }
}
