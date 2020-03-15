package zongzhe.java_basic.functions;

/**
 * JDK5.0 新特性：可变个数形参的方法
 * 1. 可变个数形参的格式：数据类型...变量名
 * 2. 当调用可变个数形参的方法时，可变个数的形参变量个数为0，1，或多个。
 * 3. 可变个数形参的方法与同一个类中的其他同名方法之间构成重载。
 */

public class VarArgDemo {
    public static void main(String[] args) {
        VarArg varArg = new VarArg();
        varArg.method("abc", "def", "thg");
        varArg.method(new String[]{"abc", "def", "thg"});// 这样也是可以的。

    }
}

class VarArg {
    public void method(String... strs) {
        for (String str : strs) System.out.println(str);
    }

}
