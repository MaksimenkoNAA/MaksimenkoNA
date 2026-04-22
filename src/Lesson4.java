public class Lesson4 {
    public static void checkSumSign() {
        int a = 65;  // инициализация переменной a
        int b = -11;  // инициализация переменной b
        int sum = a + b;  // вычисление суммы
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void main(String[] args) {
        checkSumSign();  // вызов метода
    }
}
