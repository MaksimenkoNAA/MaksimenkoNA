public class Lesson10 {
    public static void printStringNTimes(String text, int count) {
        if (count < 0) {
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printStringNTimes("Привет", 5);
    }
}