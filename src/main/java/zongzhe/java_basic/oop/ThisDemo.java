package zongzhe.java_basic.oop;


/**
 * This关键字的使用：
 * 1. 理解为：当前对象，或者当前正在创建的对象。
 * 2. 适用范围：this可以使用在方法或够再去的内部。
 * 3. 可以调用的结构：属性、方法，构造器
 * 4. 在方法中使用this：可以在方法内，调用当前类的属性或方法。
 * 5. this来调用构造器。构造器中不能调用自己->如果声明了n个构造器，则最多可以有n-1个构造器调用this.
 * 6. 规定：this构造器的调用必须是首行。
 */
public class ThisDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        Person p2 = new Person(18);
        p2.eat();
    }
}

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name; // 就近原则认为是形参
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person() {
        // 100行初始化信息
        System.out.println("100行初始化信息");
    }

    public Person(int age) {
        // 100行初始化信息
        this(); // 调用当前类中空参的构造器
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
        this.show();
    }

    public void show() {
        System.out.println("age: " + age);
    }
}
