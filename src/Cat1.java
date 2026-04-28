        public class Cat1 extends Animal1 {
            private static int catCount = 0;
            private boolean isFull;
            public Cat1(String name) {
                super(name);
                this.isFull = false;
                catCount++;
            }
            public void run(int distance) {
                if (distance <= 200) {
                    System.out.println(name + " пробежал " + distance + " м.");
                } else {
                    System.out.println(name + " не может пробежать " + distance + " м. (максимум 200 м.)");
                }
            }
            public void swim(int distance) {
                System.out.println(name + " не умеет плавать!");
            }
            public void eatFromBowl(Bowl bowl, int foodAmount) {
                if (!isFull && bowl.takeFood(foodAmount)) {
                    isFull = true;
                    System.out.println(name + " поел и теперь сыт.");
                } else if (isFull) {
                    System.out.println(name + " уже сыт и не хочет есть.");
                } else {
                    System.out.println(name + " не стал есть — в миске недостаточно еды.");
                }
            }
            public boolean isFull() {
                return isFull;
            }
            public static int getCatCount() {
                return catCount;
            }
        }