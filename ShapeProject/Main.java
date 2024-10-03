public class Main {
    public static void main(String[] args) {
        // Crear un círculo
        Circle circle = new Circle(2.5, "blue", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Crear un rectángulo
        Rectangle rectangle = new Rectangle(2.0, 4.0, "green", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Crear un cuadrado
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
