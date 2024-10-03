public abstract class Shape {
    private String color;
    private boolean filled;

   
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

  
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Método abstracto que debe ser implementado por las clases hijas
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape[color=%s, filled=%b]", color, filled);
    }
}

