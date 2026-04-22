public class Lesson10 {
    /**
     * Печатает указанную строку в консоль заданное количество раз.
     *
     * @param text строка, которую нужно напечатать
     * @param count количество повторений (должно быть неотрицательным)
     */
    public static void printStringNTimes(String text, int count) {
        if (count < 0) {
            System.out.println("Ошибка: количество повторений не может быть отрицательным");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        // Тестовые случаи
        printStringNTimes("Привет", 5);
    }
}