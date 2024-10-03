public class Circle {
    private double radius;
    private String color;

    // Constructor por defecto
    public Circle() {
        this(1.0, "red");  // Llama al constructor con parámetros
    }

    // Constructor con radio
    public Circle(double radius) {
        this(radius, "red");  // Llama al constructor con radio y color por defecto
    }

    // Constructor con radio y color
    public Circle(double radius, String color) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

