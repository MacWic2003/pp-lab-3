package geometry;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), 5);
        System.out.println("Środek koła: x = " + circle.getCenter().getX() + ", y = " + circle.getCenter().getY());
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole koła: " + circle.getArea());
    }
}