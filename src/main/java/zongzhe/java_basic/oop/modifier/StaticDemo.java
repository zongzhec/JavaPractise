package zongzhe.java_basic.oop.modifier;

/**
 * static 静态的
 *
 * @see <a href = "https://www.bilibili.com/video/av83956740?p=207"/>
 * static 是一个关键字，同时是一个修饰符。
 * <p>
 * 可以修饰属性、方法、代码块、内部类。
 * <p>
 * static修饰的属性，称为静态变量、类变量。
 * 静态属性和非静态属性的不同：
 * 1. 值的存储位置不同：非静态-堆；静态-方法区。
 * 2. 值的初始化时机不同：非静态-在创建实例对象时，在<init>()；静态-类初始化，在<clinit>()，比非静态要早。
 * 3. 值的共享性不同：非静态-每一个对象是独立的，各自存一份；静态-所有该类的对象共享一份。
 * 4. 值的生命周期不同：非静态-从对象的创建到回收；静态-累的初始化到类的卸载。
 * 5. get/set不同。
 * <p>
 * static修饰的方法，称为静态方法/类方法。
 * 1. 可以通过“类名.方法”调用（建议），也可以通过“对象.方法”调用。
 * 2. 静态方法中不可以出现this, super等。
 * 3. 静态方法中不能直接使用本类中的非静态方法、属性。
 * 4. 静态方法不能被重写，因为它不属于对象。
 * <p>
 * static修饰的代码块为静态的属性初始化。
 * 1. 执行的特点：
 * 1.1. 无论创建几个对象，静态代码块只执行一次。如果有多个，就按顺序执行。
 * 1.2. 优先于非静态代码块执行。
 * 1.3. 子类初始化时，若父类还没初始化，则先初始化父类，即先执行父类的<clinit>
 */
public class StaticDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("P1 Name");
        p1.name = "P1 Name"; // Recommended
        p1.setId("P1 ID");
        System.out.println("P2 name: " + p2.getName());
        System.out.println("P2 ID: " + p2.getId());
    }
}

class Person {
    static String name = "default name";
    String id = "default ID";

    static {
        System.out.println("执行静态代码块");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) { // 也是静态方法
        Person.name = name; // 没有this
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
