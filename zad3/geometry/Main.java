package geometry;

public class Main {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(new Point(0, 0), 10, "Czerwony");

        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Środek koła: x = " + coloredCircle.getCenter().getX() + ", y = " + coloredCircle.getCenter().getY());
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole koła: " + coloredCircle.getArea());
    }
}