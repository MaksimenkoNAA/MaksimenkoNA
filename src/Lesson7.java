public class Lesson7 {
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void main(String[] args) {
        System.out.println("5 + 6 = 11" + checkSumInRange(5, 6));
    }
}