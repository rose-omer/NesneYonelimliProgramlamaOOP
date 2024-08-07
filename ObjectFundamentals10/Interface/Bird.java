package ObjectFundamentals10.Interface;

abstract class Bird extends  Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void Fly() {
        System.out.println("Kuş "+name+"ucuyor...");
    }

    @Override
    public void land() {
        System.out.println("Kuş "+name+"konuyor...");

    }
}
