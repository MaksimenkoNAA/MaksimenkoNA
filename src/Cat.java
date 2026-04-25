public class Cat extends Animal {
    String color;
    public Cat (String name, String color) {
        super(name);
        this.color = color;
    }
    public  void run () {
                    System.out.println("Кот имя: " + name + " цвет: " + color + "пробежал 200 метров");
    }
    public  void swim () {
                  System.out.println("Кот имя: " + name + " цвет: " + color + "не умеет плавать");
    }
}
