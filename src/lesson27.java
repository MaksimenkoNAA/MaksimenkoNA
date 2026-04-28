public class lesson27 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Мурзик");
        Dog1 dog1 = new Dog1("Бобик");
        cat1.run(150);
        cat1.swim(5);
        dog1.run(400);
        dog1.swim(8);
        Bowl bowl = new Bowl(15);
        Cat1[] cats = {cat1,  new Cat1("Рыжик")};

        System.out.println("Коты пытаются поесть:");
        for (Cat1 cat : cats) {
        }
        System.out.println("Статус сытости котов:");
        for (Cat1 cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску и даём поесть последнему коту
        bowl.addFood(10);
        cats[2].eatFromBowl(bowl, 15);

        System.out.println("Финальный статус сытости:");
        for (Cat1 cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }
    }
}