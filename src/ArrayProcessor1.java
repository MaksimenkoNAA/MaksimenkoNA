public class ArrayProcessor1 {
        public static int processArray(String[][] array) throws MyArraySizeException1, MyArrayDataException1 {
            // Проверка размера массива
            if (array == null || array.length != 4) {
                throw new MyArraySizeException1("Массив должен содержать 4 строки");
            }
            for (int i = 0; i < 4; i++) {
                if (array[i] == null || array[i].length != 4) {
                    throw new MyArraySizeException1(
                            String.format("Строка %d должна содержать 4 элемента", i)
                    );
                }
            }
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        int value = Integer.parseInt(array[i][j]);
                        sum += value;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException1(
                                String.format("Некорректные данные в ячейке [%d][%d]: '%s'", i, j, array[i][j])
                        );
                    }
                }
            }
            return sum;
        }
    }