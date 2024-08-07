package ObjectFundamentals01;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Triangle {
    double edgeA;
    double edgeB;
    double edgeC;

    double getArea(){
        double halfPiremeter =(edgeA+edgeB+edgeC)/2;
        return (halfPiremeter-edgeA)*(halfPiremeter-edgeB)*(halfPiremeter-edgeC);
    }
    double getPerimeter(){
        double perimeter= edgeA+edgeB+edgeC;
        return  perimeter;
    }

}
