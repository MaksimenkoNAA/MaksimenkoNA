public class Lesson11 {
    /**
     * Определяет, является ли указанный год високосным.
     * Правило:
     * - каждый 4‑й год — високосный;
     * - но каждый 100‑й год — не високосный;
     * - однако каждый 400‑й год — снова високосный.
     *
     * @param year год для проверки (целое число)
     * @return true, если год високосный, false — если нет
     */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println("2026: " + isLeapYear(2026)); // true (делится на 400)
    }
}