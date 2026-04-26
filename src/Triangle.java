public class Triangle extends Figure {
        private final double sideA;
        private final double sideB;
        private final double sideC;
        Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            if (!isValidTriangle(sideA, sideB, sideC)) {
                throw new IllegalArgumentException("Указанные стороны не образуют треугольник");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        public boolean isValidTriangle(double a, double b, double c) {
            return a + b > c && a + c > b && b + c > a;
        }
        public double getPerimeter() {
            return sideA + sideB + sideC;
        }
        public double getArea() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
    }
