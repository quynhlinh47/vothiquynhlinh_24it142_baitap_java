package exercise6_4;

public class Main {
    public static void main(String[] args) {
    
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Vị trí ban đầu của MovablePoint: " + point);
        point.moveUp();
        System.out.println("Sau moveUp: " + point);
        point.moveRight();
        System.out.println("Sau moveRight: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println("\nVị trí ban đầu của MovableCircle: " + circle);
        circle.moveDown();
        System.out.println("Sau moveDown: " + circle);
        circle.moveLeft();
        System.out.println("Sau moveLeft: " + circle);
    }
}
