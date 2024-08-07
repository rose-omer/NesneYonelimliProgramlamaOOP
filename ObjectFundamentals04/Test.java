package ObjectFundamentals04;

import ObjectFundamentals04.Paketler.dessert.Pie;
import ObjectFundamentals04.Paketler.frute.Apple;
import ObjectFundamentals04.Paketler.frute.Peach;

public class Test {
    public static void main(String[] args) {
        Pie pie =new Pie();
        Apple apple =new Apple();
        pie.add(apple);
        Peach peach =new Peach();
        pie.add(peach);
    }
}
