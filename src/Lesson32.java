public class Lesson32 {
public static void main(String[] args) {
    System.out.println("=== ТЕСТИРОВАНИЕ ОБРАБОТКИ МАССИВА 4×4 ===");
    String[][] correctArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    String[][] wrongSizeArray = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };
    String[][] invalidDataArray = {
            {"1", "2", "3", "4"},
            {"5", "abc", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    System.out.println("\n1. ОБРАБОТКА КОРРЕКТНОГО МАССИВА:");
    try {
        int result = ArrayProcessor1.processArray(correctArray);
        System.out.println("Сумма элементов: " + result);
    } catch (MyArraySizeException1| MyArrayDataException1 e) {
        System.err.println("Ошибка: " + e.getMessage());
    }
    System.out.println("\n2. ОБРАБОТКА МАССИВА НЕПРАВИЛЬНОГО РАЗМЕРА:");
    try {
        int result = ArrayProcessor1.processArray(wrongSizeArray);
        System.out.println("Сумма элементов: " + result);
    } catch (MyArraySizeException1 | MyArrayDataException1 e) {
        System.err.println("Ошибка: " + e.getMessage());
    }
    System.out.println("\n3. ОБРАБОТКА МАССИВА С НЕКОРРЕКТНЫМИ ДАННЫМИ:");
    try {
        int result = ArrayProcessor1.processArray(invalidDataArray);
        System.out.println("Сумма элементов: " + result);
    } catch (MyArraySizeException1 | MyArrayDataException1 e) {
        System.err.println("Ошибка: " + e.getMessage());
    }
    demonstrateArrayIndexOutOfBoundsException();
}
private static void demonstrateArrayIndexOutOfBoundsException() {
    System.out.println("\n=== ДЕМОНСТРАЦИЯ ArrayIndexOutOfBoundsException ===");
    int[] testArray = {1, 2, 3, 4};
    System.out.println("\nПопытка доступа к элементу с индексом 5:");
    try {
        System.out.println("Элемент [5]: " + testArray[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Поймано исключение: " + e.getClass().getSimpleName());
        System.err.println("Сообщение: " + e.getMessage());
        System.err.println("Исключение обработано — программа продолжает работу.");
    }
    System.out.println("\nПопытка доступа с отрицательным индексом:");
    try {
        System.out.println("Элемент [-1]: " + testArray[-1]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Поймано исключение: " + e.getClass().getSimpleName());
        System.err.println("Сообщение: " + e.getMessage());
    }
}
}
