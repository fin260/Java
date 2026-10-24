package pr1.part4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) { super(size, price, color); }

    @Override
    public void dressMan() { System.out.println("Мужчина надел штаны: " + this); }

    @Override
    public void dressWomen() { System.out.println("Женщина надела штаны: " + this); }
}
