package ObjectFundamentals01;

public class RectangleTest4 {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        rectangle.width=3;
        rectangle.height=4;
        int area = rectangle.getArea();
        System.out.println("Alan : "+area);
        int perimeter = rectangle.getPerimeter();
        System.out.println("Çevre : "+perimeter);
    }
}
