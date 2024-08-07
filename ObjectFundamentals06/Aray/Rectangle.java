package ObjectFundamentals06.Aray;

import java.io.Serializable;

public class Rectangle implements Serializable {
    private double width;
    private double height;


    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    // eksi değer girerse IllegalArgumentException fırlatıp durdurcaz
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Yükseklik EKSİ OLAMAZ " + height);
        }
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    // bu şekil - girilirse hata düzeltme yapabiliriz
    public void setWidth(double width) {
        if (width < 0) {
            this.width = -width;
        } else this.width = width;
    }

    public double getPerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public double getArea() {
        double area = height * width;
        return area;
    }
}
