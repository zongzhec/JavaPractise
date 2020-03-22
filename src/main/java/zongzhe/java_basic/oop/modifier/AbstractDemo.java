package zongzhe.java_basic.oop.modifier;

import javax.sound.midi.Soundbank;

/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=222">https://www.bilibili.com/video/av83956740?p=222</a>
 * <p>
 * abstract 可以修饰：
 * 类（内部类，外部类）
 * 方法
 * <p>
 * 1. 为什么需要abstract？
 * 在设计父类时，发现某些方法时无法给出具体实现的，因为具体的应该在子类中实现。这样在父类中就可以设计为“抽象方法”。
 * 包含抽象方法的类，必须是一个抽象类。
 * <p>
 * 2. 抽象类的特点：
 * 抽象类不能直接new对象
 * 抽象类就是用来被继承的，且子类必须实现抽象类的所有抽象方法。
 * 抽象类的变量可以与子类的对象构成多态引用，执行子类重写的方法。
 * 抽象类可以和普通类一样，拥有属性、构造器、代码块、非抽象类的方法邓程元，这些给子类用。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Graphic g = new Circle(2);
        System.out.println("面积： " + g.getArea());
    }
}

abstract class Graphic {
    private String name;

    // 在父类中，无法给出统一实现。
    abstract double getArea();
}

class Rectangle extends Graphic {
    private double length;
    private double hight;

    @Override
    double getArea() {
        return length * hight;
    }
}

class Circle extends Graphic {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}
