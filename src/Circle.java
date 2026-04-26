public class Circle  extends Figure {
        private final double radius;
        Circle(double radius, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            this.radius = radius;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }