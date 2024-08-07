package ObjectFundamentals07;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String >ulkeKisaltmalari =new HashMap<>();
        ulkeKisaltmalari .put("tr","Türkiye");
        ulkeKisaltmalari.put("DE", "Almanya");
        ulkeKisaltmalari.put("FR", "Fransa");
        ulkeKisaltmalari.put("JP", "Japonya");
        ulkeKisaltmalari.put("IT", "İtalya");
        //SİLME
        ulkeKisaltmalari.remove("IT");
        String myCountry =ulkeKisaltmalari.get("tr");
        System.out.println("ülkem : "+myCountry);

        for (String countary : ulkeKisaltmalari.values()){
            System.out.println("ÜLKE : "+countary);
        }
        for (String key : ulkeKisaltmalari.keySet()){
            System.out.println("kodlar : "+key);
        }
    }
}
