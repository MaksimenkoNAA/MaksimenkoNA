abstract class Figure {
    protected String fillColor;
    protected String borderColor;
    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public abstract double getPerimeter();
    public abstract double getArea();

    public void printInfo(String figureName) {
        System.out.printf("%s: Периметр: %.2f, Площадь: %.2f, Цвет заливки: %s, Цвет границы: %s%n",
                figureName, getPerimeter(), getArea(), fillColor, borderColor);
    }
}