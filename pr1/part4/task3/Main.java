package pr1.part4.task3;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String ask(String text) {
        System.out.print(text);
        return SCANNER.hasNextLine() ? SCANNER.nextLine().trim() : "";
    }

    private static int askNumber(String text) {
        try {
            return Integer.parseInt(ask(text));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static User login(Store store) {
        for (int attempt = 1; attempt <= 3; attempt++) {
            String login = ask("Логин: ");
            String password = ask("Пароль: ");
            User user = store.authenticate(login, password);
            if (user != null) {
                System.out.println("Добро пожаловать, " + user.getLogin() + "!");
                return user;
            }
            System.out.println("Неверный логин или пароль (попытка " + attempt + " из 3)");
        }
        return null;
    }

    private static void printCatalogs() {
        Category[] categories = Category.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i].getTitle());
        }
    }

    private static void printProducts(Store store) {
        printCatalogs();
        int number = askNumber("Номер каталога: ");
        Category[] categories = Category.values();
        if (number < 1 || number > categories.length) {
            System.out.println("Такого каталога нет");
            return;
        }
        Category category = categories[number - 1];
        System.out.println("Каталог \"" + category.getTitle() + "\":");
        for (Product product : store.getProducts(category)) {
            System.out.println("  " + product);
        }
    }

    private static void addToCart(Store store, Cart cart) {
        int id = askNumber("Номер товара: ");
        Product product = store.findById(id);
        if (product == null) {
            System.out.println("Такого товара нет");
            return;
        }
        cart.add(product);
        System.out.println("В корзину добавлено: " + product.getName());
    }

    private static void buy(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста, покупать нечего");
            return;
        }
        System.out.println("Покупка оформлена на сумму " + cart.total() + " руб. Спасибо!");
        cart.clear();
    }

    public static void main(String[] args) {
        Store store = new Store();
        User user = login(store);
        if (user == null) {
            System.out.println("Вход не выполнен");
            return;
        }

        Cart cart = new Cart();
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("1 - Список каталогов");
            System.out.println("2 - Товары каталога");
            System.out.println("3 - Добавить товар в корзину");
            System.out.println("4 - Показать корзину");
            System.out.println("5 - Купить");
            System.out.println("0 - Выход");
            int choice = askNumber("Выберите действие: ");
            switch (choice) {
                case 1:
                    printCatalogs();
                    break;
                case 2:
                    printProducts(store);
                    break;
                case 3:
                    addToCart(store, cart);
                    break;
                case 4:
                    cart.print();
                    break;
                case 5:
                    buy(cart);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Нет такого пункта меню");
            }
        }
        System.out.println("До свидания!");
    }
}
