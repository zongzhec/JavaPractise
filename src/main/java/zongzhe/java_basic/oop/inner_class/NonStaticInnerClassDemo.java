package zongzhe.java_basic.oop.inner_class;

public class NonStaticInnerClassDemo {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Outer2.Inner in = out.getInner();
        in.test();
        Outer2.Inner in2 = out.new Inner(); // 也可以，但一般不这么写
        in2.test();

    }
}

class Outer2 {
    private static int i;
    private int j;

    class Inner {
        public void test() {
            System.out.println("static i = " + i);
            System.out.println("non static j = " + j);
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static Inner getInner2() {
//        return new Inner(); // 在外部类的静态方法中不允许使用非静态的内部类。
        return null;
    }


}
