package exercise6_5;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println("Ban đầu: " + c1);
        System.out.println("Chu vi: " + c1.getPerimeter());
        System.out.println("Diện tích: " + c1.getArea());

        ResizableCircle rc1 = new ResizableCircle(10);
        System.out.println("\nBan đầu: " + rc1);
        rc1.resize(50); 
        System.out.println("Sau khi resize (50%): " + rc1);
        System.out.println("Chu vi: " + rc1.getPerimeter());
        System.out.println("Diện tích: " + rc1.getArea());
    }
}
