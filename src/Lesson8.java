public class Lesson8 {
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static void main(String[] args) {
        printNumberSign(67);
    }
}