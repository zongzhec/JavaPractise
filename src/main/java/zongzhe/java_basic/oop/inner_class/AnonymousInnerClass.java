package zongzhe.java_basic.oop.inner_class;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("obj.getClass(): " + obj.getClass()); // 运行时类型：java.lang.Object

        Object ano = new Object() {

        };
        System.out.println("ano.getClass(): " + ano.getClass()); // 运行时类型：AnonymousInnerClass$1

        // 创建匿名内部类
        Outer4 inner = new Outer4() {
            @Override
            public void test() {
                System.out.println("inner within Outer4"); //子类重写父类的抽象方法
            }
        };
        inner.test();

        // 创建实参构造的匿名内部类
        Outer4 inner2 = new Outer4("inner2") {
            @Override
            public void test() {
                System.out.println("inner2 within Outer4"); //子类重写父类的抽象方法
            }
        };
        inner2.test();

        // 创建接口的匿名内部类
        OutInter innerInter = new OutInter() {
            @Override
            public void test() {
                System.out.println("接口的内部类");
            }
        };
        innerInter.test();
    }
}


abstract class Outer4 {
    private String info;

    public Outer4() {
        super();
    }

    public Outer4(String info) {
        super();
        this.info = info;
    }

    public abstract void test();
}

interface OutInter{
    void test();
}
