package pr1.part4.task3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<User> users = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();

    public Store() {
        users.add(new User("admin", "1234"));
        users.add(new User("student", "pass"));

        products.add(new Product(1, "Смартфон", 29990, Category.ELECTRONICS));
        products.add(new Product(2, "Наушники", 4990, Category.ELECTRONICS));
        products.add(new Product(3, "Ноутбук", 64990, Category.ELECTRONICS));
        products.add(new Product(4, "Java. Полное руководство", 1890, Category.BOOKS));
        products.add(new Product(5, "Чистый код", 1500, Category.BOOKS));
        products.add(new Product(6, "Куртка", 6500, Category.CLOTHING));
        products.add(new Product(7, "Джинсы", 3200, Category.CLOTHING));
    }

    public User authenticate(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.checkPassword(password)) {
                return user;
            }
        }
        return null;
    }

    public List<Product> getProducts(Category category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category) {
                result.add(product);
            }
        }
        return result;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
