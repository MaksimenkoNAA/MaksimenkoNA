public class Dog extends Animal {
    String color;
    public Dog (String name, String color) {
        super(name);
        this.color = color;
    }
    public  void run () {
        System.out.println("Собака имя: " + name + " цвет: " + color + "пробежал 500 метров");
    }
    public  void swim () {
        System.out.println("Собака имя: " + name + " цвет: " + color + "проплыл 10 метров");
    }
}
