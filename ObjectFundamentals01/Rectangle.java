package ObjectFundamentals01;

public class Rectangle {
    int width;
    int height;

    int getArea(){
        int area= height*width;
        return  area;
    }
    int getPerimeter(){
        int perimeter= 2*(height+width);
        return  perimeter;
    }
}
