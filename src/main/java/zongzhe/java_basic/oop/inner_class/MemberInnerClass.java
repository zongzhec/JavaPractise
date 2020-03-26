package zongzhe.java_basic.oop.inner_class;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer3 out = new Outer3();
        out.outTest();
        
    }
}


class Outer3 {
    private int i = 10;
    private static int j = 20;

    public void outTest() {
        int testNum = 30;
        System.out.println("in outTest()");
//        Inner in; // Error: Inner还没有声明
        class Inner {
            public void testInner() {
                System.out.println("in testInner()");
                System.out.println(i);
                System.out.println(j);
//                testNum++; // Error: testNum是final
                System.out.println(testNum);
            }
        } // Inner 的作用域由此开始
        Inner in;
    } // Inner 的作用域到此结束

    public static void outTest2() {
        System.out.println("in outTest2()");
        class Inner {
            public void testInner2() {
                System.out.println("in testInner2()");
//                System.out.println(i); // Error: 这里报错是因为outTest2本身是静态方法。
                System.out.println(j);
            }
        }
    }
}