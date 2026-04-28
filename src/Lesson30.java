public class Lesson30 {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ PROCESSARRAY ===");
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayProcessor.processArray(validArray);
            System.out.println("✓ Тест 1 — Сумма элементов: " + result); // Ожидаемый результат: 136
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("✗ Ошибка: " + e.getMessage());
        }
        String[][] invalidDataArray = {
                {"1", "2", "abc", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("✓ Тест 2 — Сумма элементов: " + result);
        } catch (MyArraySizeException|MyArrayDataException e) {
            System.err.println("✗ Тест 2 — Ошибка: " + e.getMessage());
                 }
                String[][] smallArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        try {
            int result = ArrayProcessor.processArray(smallArray);
            System.out.println("✓ Тест 3 — Сумма элементов: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("✗ Тест 3 — Ошибка: " + e.getMessage());
                 }
    }
}