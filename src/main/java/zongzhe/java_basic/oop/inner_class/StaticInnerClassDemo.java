package zongzhe.java_basic.oop.inner_class;

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        // 调用Inner的test()方法
        Outer.Inner inner = new Outer.Inner();
        inner.test();

        Outer.Inner.testStatic();

    }
}

class Outer {
    private static int i;
    private int j;

    public Inner getInner() {
        Inner in = new Inner();
        return in;
    }

    static class Inner {
        public void test() {
            System.out.println(i); // 直接使用外部类的私有成员
            // System.out.println(j); // Error: static 不能直接使用非static
        }

        public static void testStatic() {
            System.out.println("内部类的static方法");
        }
    }
}
