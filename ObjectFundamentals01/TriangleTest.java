package ObjectFundamentals01;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle =new Triangle();
        triangle.edgeA=3;
        triangle.edgeB=4;
        triangle.edgeC=5;
        System.out.println("Alan : "+triangle.getArea());
        System.out.println("Alan : "+triangle.getPerimeter());
    }
}
