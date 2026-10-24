package pr1.part4.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double total() {
        double sum = 0;
        for (Product product : items) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void print() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }
        for (Product product : items) {
            System.out.println(product);
        }
        System.out.println("Итого: " + total() + " руб.");
    }

    public void clear() {
        items.clear();
    }
}
