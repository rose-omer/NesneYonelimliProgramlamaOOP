package ObjectFundamentals07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List  <String> provinceList =new ArrayList<>();
        //ekleme
        provinceList.add("İstanbul");
        provinceList.add("Ankara");
        provinceList.add("Adana");
        provinceList.add("Bursa");
        provinceList.add("Diyarbakır");

        for (String province : provinceList){
            System.out.println("İl : "+province);
        }
        //silme
        provinceList.remove("İstanbul");

        String myProvince=provinceList.get(2);
        System.out.println("3 sıradaki il  : "+myProvince);

        // sıralama

        Collections.sort(provinceList);
        int index= Collections.binarySearch(provinceList,"Bursa");
        System.out.println("Bursa  sıra no : "+index);

        //ters sıralama
        Collections.reverse(provinceList);



    }
}
