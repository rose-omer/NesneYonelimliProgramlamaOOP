package ObjectFundamentals11.Specifiation;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB mouse = new AdvanceMouse();
        computer.setUsb(mouse);
        computer.testUSB();

    }
}
