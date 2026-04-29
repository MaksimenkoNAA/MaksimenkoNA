public class Lesson35 {
        public static void printColor() {
            int value = 101;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Жёлтый");
            } else {  // value > 100
                System.out.println("Зелёный");
            }
        }
        public static void main(String[] args) {
            printColor();
        }
    }
