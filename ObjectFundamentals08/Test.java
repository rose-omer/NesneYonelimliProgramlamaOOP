package ObjectFundamentals08;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Category categoryA = new Category(123, "Beyaz eşya");
        List<Product> productList = new ArrayList<>();
        categoryA.setProductList(productList);

        Product product0 = new Product(400, "Buzdolabı makinesi", 900);
        product0.setCategory(categoryA);
        categoryA.getProductList().add(product0);

        Product product1 = new Product(401, "Çamasır makinaso", 600);
        product1.setCategory(categoryA);
        categoryA.getProductList().add(product1);

        Product product2 = new Product(402, "Bulaşık makinesi", 500);
        product2.setCategory(categoryA);
        categoryA.getProductList().add(product2);


        System.out.println("Katogori Kimlik : " + categoryA.getCategoryId());
        System.out.println("Katogori Adı : " + categoryA.getCategoryName());

        for (Product product : categoryA.getProductList()) {
            System.out.println(product.getProductId() + "  " + product.getProductName() + " " + product.getSalesPrice());
        }




    }
}
