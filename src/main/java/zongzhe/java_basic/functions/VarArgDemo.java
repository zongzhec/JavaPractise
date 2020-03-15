package zongzhe.java_basic.functions;

/**
 * JDK5.0 新特性：可变个数形参的方法
 * 1. 可变个数形参的格式：数据类型...变量名
 * 2. 当调用可变个数形参的方法时，可变个数的形参变量个数为0，1，或多个。
 * 3. 可变个数形参的方法与同一个类中的其他同名方法之间构成重载。
 * 4. 可变个数形参的方法与同类型参数的数组结构相同，不可同时出现在类声明中。
 * 5. 规定：如果方法中存在可变个数形参，要求可变个数形参声明在方法形参的最后。
 * 6. 推论：一个方法中最多只能有一个可变个数的形参。
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

    // 与对应的可变形参不能同时声明。
//    public void method(String[] strs) {
//        for (String str : strs) System.out.println(str);
//    }

    // 编译不通过
//    public void method(String... strs, int i) {
//        for (String str : strs) System.out.println(str);
//    }
}
