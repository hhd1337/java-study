package mid2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

    Map<Product, Integer> productCountMap = new HashMap<>();

    public void add(Product product, int count) {
        productCountMap.put(product, productCountMap.getOrDefault(product, 0) + count);
    }

    public void minus(Product product, int count) {
        if (!productCountMap.containsKey(product)) {
            return;
        }

        Integer originalCount = productCountMap.get(product);

        if (originalCount <= count) {
            productCountMap.remove(product);
        } else {
            productCountMap.put(product, productCountMap.get(product) - count);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Entry<Product, Integer> entry : productCountMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
