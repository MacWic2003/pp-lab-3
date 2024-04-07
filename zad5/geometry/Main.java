package geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println("Właściwości prostokąta:");
        System.out.println("Długość: " + rectangle.calculatePerimeter());
        System.out.println("Pole: " + rectangle.calculateArea());
    }
}