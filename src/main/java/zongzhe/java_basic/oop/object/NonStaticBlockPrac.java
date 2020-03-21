package zongzhe.java_basic.oop.object;


/**
 * 当创建的是子类对象时，会先执行父类的实例初始化方法。
 */
public class NonStaticBlockPrac {
    public static void main(String[] args) {
        B b = new B(20);
        System.out.println("**************************");
        A a = new C(20);
    }
}

class A {
    private int a = getInt();

    {
        a++;
        System.out.println("(1)A的非静态代码块");
        System.out.println("(1)a = " + a);
    }

    A(int num) {
        a = num;
        System.out.println("(2)A的有参构造");
        System.out.println("(2)a = " + a);
    }

    public int getInt() {
        System.out.println("(3)A->getInt()");
        System.out.println("(3)a = " + a);
        return 1;
    }
}

class B extends A {
    private int b = getIntB();

    {
        b++;
        System.out.println("(1)B的非静态代码块");
        System.out.println("(1)b = " + b);
    }

    B(int num) {
        super(num);
        b = num;
        System.out.println("(2)B的有参构造");
        System.out.println("(2)b = " + b);
    }

    public int getIntB() {
        System.out.println("(3)B >getIntB()");
        System.out.println("(3)b = " + b);
        return 1;
    }
}

class C extends A {


    private int c = getInt();

    {
        c++;
        System.out.println("(1)C的非静态代码块");
        System.out.println("(1)c = " + c);
    }

    C(int num) {
        super(num);
        c = num;
        System.out.println("(2)C的有参构造");
        System.out.println("(2)c = " + c);
    }

    @Override
    public int getInt() {
        System.out.println("(3)C >getInt()");
        System.out.println("(3)c = " + c);
        return 1;
    }
}
