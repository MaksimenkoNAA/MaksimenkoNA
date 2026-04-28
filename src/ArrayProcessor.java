public class ArrayProcessor {
    private static final int REQUIRED_SIZE = 4;
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        validateSize(array);
        int sum = 0;
        for (int i = 0; i < REQUIRED_SIZE; i++) {
            for (int j = 0; j < REQUIRED_SIZE; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException(
                            String.format("Неверные даные в ячейке [%d][%d]: '%s'", i, j, array[i][j])
                    );
                }
            }
        }
        return sum;
    }

    private static void validateSize(String[][] array) throws MyArraySizeException {
        if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }
        if (array.length != REQUIRED_SIZE) {
            throw new MyArraySizeException(
                    String.format("Неверное количество строк: ожидается %d, получено %d",
                            REQUIRED_SIZE, array.length)
            );
        }
        for (int i = 0; i < REQUIRED_SIZE; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException(
                        String.format("Строка с индексом %d имеет значение null", i)
                );
            }
            if (array[i].length != REQUIRED_SIZE) {
                throw new MyArraySizeException(String.format("Неверное количество столбцов в строке %d: ожидается %d, получено %d", i, REQUIRED_SIZE, array[i].length)
                );
            }
        }
    }
}