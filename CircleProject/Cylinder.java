public class Cylinder extends Circle {
    private double height;

   
    public Cylinder() {
        this(1.0, 1.0, "red");  
    }

    public Cylinder(double radius) {
        this(radius, 1.0, "red"); 
    }

    
    public Cylinder(double radius, double height) {
        this(radius, height, "red");  
    }

    public Cylinder(double radius, double height, String color) {
        super(radius);  
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;  
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + ", radius=" + getRadius() + ", color=" + getColor() + "]";
    }
}
