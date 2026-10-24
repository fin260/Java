package pr1.part4.task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] all = {
                new TShirt(Size.M, 1500, "белый"),
                new Pants(Size.L, 3500, "синий"),
                new Skirt(Size.S, 2800, "красный"),
                new Tie(Size.XXS, 900, "чёрный")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(all);
        atelier.dressMan(all);

        System.out.println("=== Размеры ===");
        for (Size size : Size.values()) {
            System.out.println(size + " (" + size.getEuroSize() + "): " + size.getDescription());
        }
    }
}
