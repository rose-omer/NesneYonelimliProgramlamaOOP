package ObjectFundamentals11.Specifiation;

public class Computer {
    private  USB usb;

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
    public void testUSB(){
        usb.connect();
        String data=usb.read();
        System.out.println("Data okunuyor "+data);
        usb.write("BİR VERİ ");
        usb.disconnect();
    }


}
