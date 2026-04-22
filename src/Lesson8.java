public class Lesson8 {
    /**
     * Определяет, является ли переданное число положительным или отрицательным.
     * Ноль считается положительным числом.
     *
     * @param number целое число для проверки
     */
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void main(String[] args) {
        // Тестовые случаи
        printNumberSign(67);   // Положительное (число > 0)
    }
}