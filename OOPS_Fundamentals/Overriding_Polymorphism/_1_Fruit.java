
// Question 1:
// Create a base class Fruit with name, taste and size as its attributes. Create a method called eat() which describes the name of the fruit and its taste. Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
//
// 1_Fruit.java
// Question 1: Base class Fruit with inheritance and method overriding

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "Sweet and crisp", size);
    }

    @Override
    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + " (usually red or green)");
    }
}

class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "Citrusy and tangy", size);
    }

    @Override
    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste + " (usually orange in color)");
    }
}

public class _1_Fruit {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Generic Fruit", "Varies", "Medium");
        genericFruit.eat();

        Apple apple = new Apple("Medium");
        apple.eat();

        Orange orange = new Orange("Small");
        orange.eat();
    }
}
