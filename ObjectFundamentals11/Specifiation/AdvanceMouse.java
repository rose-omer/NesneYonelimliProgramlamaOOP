package ObjectFundamentals11.Specifiation;

public class AdvanceMouse extends Mouse implements USB{
    @Override
    public void connect() {
        System.out.println("Fareye baglanılıyor ");
    }

    @Override
    public void disconnect() {
        System.out.println("Fareye baglantı kesilidi ");
    }

    @Override
    public String read() {
        System.out.println("Fareye okunuyor ");
    return "345,500";
    }

    @Override
    public void write(String data) {
        System.out.println("Fareye yazılıyor ");
        System.out.println("VERİ "+data);
    }
}
