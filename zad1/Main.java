public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.5, 2.5);
        System.out.println("Początkowe współrzędne punktu: x = " + point.getX() + ", y = " + point.getY());
        
        point.setX(3.5);
        point.setY(4.5);
        
        System.out.println("Zaktualizowane współrzędne punktu: x = " + point.getX() + ", y = " + point.getY());
    }
}