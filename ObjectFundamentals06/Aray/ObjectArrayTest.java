package ObjectFundamentals06.Aray;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Rectangle[] rectangles =new Rectangle[4];
        Rectangle rectangle0 =new Rectangle();
        rectangle0.setHeight(4);
        rectangle0.setWidth(3);
        rectangles[0]= rectangle0;

        Rectangle rectangle1=new Rectangle(13,14);
        rectangles[1]=rectangle1;

        rectangles[2]=new Rectangle();
        rectangles[2].setWidth(23);
        rectangles[2].setHeight(24);

        rectangles[3]=new Rectangle(33,44);

        double totalArea=0;

        for (int i = 0; i < rectangles.length ; i++) {
                totalArea+=rectangles[i].getArea();
        }
        System.out.println("Toplam alan : "+totalArea);

        double totalPerimeter =0;
        for (Rectangle rectangle :rectangles){
            totalPerimeter+=rectangle.getPerimeter();
        }
        System.out.println("Toplam Çevre : "+totalPerimeter);
    }
}
