package ObjectFundamentals10.Interface;

public class Bat extends Mammal implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public void Fly() {
        System.out.println("bat "+name+"ucuyor...");
    }

    @Override
    public void land() {
        System.out.println("bat "+name+"konuyor...");

    }
}
