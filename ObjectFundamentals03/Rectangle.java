package ObjectFundamentals03;
public class Rectangle {
    double width;
    double height;

    Rectangle(){

    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        double area= height*width;
        return  area;
    }
    double getPerimeter(){
        double perimeter= 2*(height+width);
        return  perimeter;
    }
}
