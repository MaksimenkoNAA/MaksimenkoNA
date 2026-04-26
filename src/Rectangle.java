public class Rectangle extends Figure {
    private final double width;
    private final double height;
    Rectangle(double width, double height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public double getArea() {
        return width * height;
    }
}
