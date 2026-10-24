package pr1.part3.movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, 20, 8);
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);

        MovableRectangle m3 = new MovableRectangle(1, 5, 6, 1, 2, 3);
        System.out.println(m3);
        System.out.println("Скорости точек одинаковы: " + m3.sameSpeed());
        m3.moveDown();
        m3.moveRight();
        System.out.println(m3);
    }
}
