package zongzhe.java_basic.oop.object;

/**
 * 非静态代码块
 * @see <a href = "https://www.bilibili.com/video/av83956740?p=202"/>
 *
 * 执行的特点：
 * 1. 在创建对象时自动执行，每创建一次就执行一次；
 *  如果有多个非静态代码块，则按顺序依次执行。
 * 2.先于构造器执行；
 * 3. 非静态代码块与属性的显式赋值按顺序执行。
 * 4. 如果创建子类的对象，会先执行父类的非静态代码块、父类的属性的显式赋值、父类的构造器
 *
 * 实例初始化
 * .java代码编译为.class时，会把代码重新组装，如果类中有n个构造器，就会重新组装为n个实力初始化方法。
 * 无参构造-><init>()
 * 有参构造-><init>(形参列表)
 *
 * 实力初始化方法由3部分组成：
 * 1. 属性的显式赋值语句；
 * 2. 非静态代码块的语句；
 * 3. 构造器的语句。
 * 其中前两个按顺序执行，最后执行第三个。
 *
 * 创建子类对象时，会先调用父类的实例初始化方法。
 * */
public class NonStaticBlockDemo {
    public static void main(String[] args) {
        Son s1 = new Son();
//        Son s2 = new Son();
//        Son s3 = new Son();
        System.out.println(s1.getNum1());
    }
}

class Father {

    private int num3 = getNum3();

    Father() {
        System.out.println("父类的无参构造");
    }

    {
        System.out.println("父类的非静态代码块1");
    }

    {
        System.out.println("父类的非静态代码块2");
    }
    private int num2 = getLaterNum();

    public int getNum3() {
        System.out.println("父类的getNum3()");
        return num3;
    }

    public int getLaterNum() {
        System.out.println("getLaterNum()");
        return 2;
    }
}

class Son extends Father{
    private int num1 = getNum1();

    Son() {
        System.out.println("无参构造");
        num1= 1;
    }

    {
        System.out.println("非静态代码块1");
        num1 = 0;
    }

    {
        System.out.println("非静态代码块2");
    }
    private int num2 = getLaterNum();

    public int getNum1() {
        System.out.println("getNum1()");
        return num1;
    }

    public int getLaterNum() {
        System.out.println("getLaterNum()");
        return 2;
    }
}
