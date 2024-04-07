package geometry;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[] {
            new Circle(new Point(1.0, 1.0), 2.0),
            new ColoredCircle(new Point(2.0, 2.0), 3.0, "Niebieski"),
            new Circle(new Point(3.0, 3.0), 4.0),
            new ColoredCircle(new Point(4.0, 4.0), 5.0, "Czerwony")
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle colored = (ColoredCircle) circle;
                System.out.println("Kolor: " + colored.getColor());
            }
        }
    }
}