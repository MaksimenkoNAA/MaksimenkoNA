public class Lesson9 {
    /**
     * Проверяет, является ли переданное число отрицательным.
     * Ноль считается положительным числом.
     *
     * @param number целое число для проверки
     * @return true, если число отрицательное, false — если положительное или ноль
     */
    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("isNegative(99) = " + isNegative(99));     // false (положительное)
    }
}