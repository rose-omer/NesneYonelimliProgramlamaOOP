package ObjectFundamentals06.Aray;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array =new int[4];
        array[0]=3;
        array[1]=7;
        array[2]=4;
        array[3]=12;

        int x =array[3];
        System.out.println("4 numaralı öğe "+x);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //dizi toplam
        int sum =0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("Toplam  :  "+sum);
        //dizi elemanları çarpma
        double product =1;
        for (int i = 0; i < array.length ; i++) {
            product*=array[i];
        }
        System.out.println("Çarpım :"+product);
    }
}
