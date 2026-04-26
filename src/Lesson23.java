public class Lesson23 {
        public static void main(String[] args) {
            // Создаём фигуры с заданными параметрами
            Circle circle = new Circle(7.0, ":Желтый", "Красный");
            Rectangle rectangle = new Rectangle(5.0, 7.0, "Голубой", "Белый");
            Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Синий", "Жёлтый");
            // Выводим информацию о каждой фигуре
            System.out.println("=== ИНФОРМАЦИЯ О ГЕОМЕТРИЧЕСКИХ ФИГУРАХ ===");
            circle.printInfo("Круг");
            rectangle.printInfo("Прямоугольник");
            triangle.printInfo("Треугольник");
        }
    }