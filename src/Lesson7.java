public class Lesson7 {
    /**
     * Проверяет, лежит ли сумма двух чисел в диапазоне [10, 20] (включительно).
     *
     * @param a первое целое число
     * @param b второе целое число
     * @return true, если сумма в пределах от 10 до 20 (включительно), иначе false
     */
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        // Тестовые случаи с выводом результата и пояснением
        System.out.println("Проверка: 5 + 6 = 11 → " + checkSumInRange(5, 6));   // true (11 в диапазоне)
    }
}