public class Lesson16 {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr1 = createArray(7, 11);
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}