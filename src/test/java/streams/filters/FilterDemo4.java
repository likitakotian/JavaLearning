package streams.filters;

import java.util.Arrays;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        //object
        List<Product> productList = Arrays.asList(new Product(1, "star", 2.89),
                new Product(2, "chair", 34.89),
                new Product(3, "table", 89.90),
                new Product(4, "fish", 89.00));
        productList.stream().filter(product -> product.price > 10.00).forEach(product -> System.out.println(product.name+"----> "+product.price));
    }
}
