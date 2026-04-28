public class Lesson28 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(7.0, ":Желтый", "Красный");
        Rectangle1 rectangle = new Rectangle1(5.0, 7.0, "Голубой", "Белый");
        Triangle1 triangle = new Triangle1(3.0, 4.0, 5.0, "Синий", "Жёлтый");
        System.out.println("ИНФОРМАЦИЯ О ГЕОМЕТРИЧЕСКИХ ФИГУРАХ");
        circle.printInfo("Круг");
        rectangle.printInfo("Прямоугольник");
        triangle.printInfo("Треугольник");
    }
}
