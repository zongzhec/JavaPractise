package zongzhe.java_basic.oop.object;

import java.util.Objects;

/**
 * Object 方法：
 * 1. Class getClass(): 返回此Object的运行类型。
 * 2. String toString(): 返回该对象的字符串表示。
 * 2.1. 当你打印一个对象时，默认调用对象的toString()
 * 2.2. 当用一个对象与String进行"+"操作时，也会调用这个方法。
 * 2.3. 建议所有子类都重写该方法。
 * 3. int hasCode()：返回该对象的哈希值（把对象的信息，通过某种算法计算出来的一个int值）
 * 理想状态下，是希望每一个对象都有一个唯一的hash码。但是现实中，可能有两个不同的对象有相同的hash码。
 * 4. boolean equals(Object obj) 指示和其他某个对象是否“相等”。
 * 重写原则：自反性、对称性、传递性、一致性，空与非空。
 * 5. void finalize(): 垃圾回收器调用。实际中，此方法用于彻底释放一些资源。
 * @see <a href="https://www.bilibili.com/video/av83956740?p=201"/>
 */
public class ObjectDemo {

    int seq = 0;

    public ObjectDemo(int seq) {
        this.seq = seq;
    }

    public static void main(String[] args) {
        Object obj = "hello"; // "hello" 是一个字符串
        System.out.println(obj.getClass());

        ObjectDemo objDemo = new ObjectDemo(1);
        System.out.println("toString: " + objDemo);

        String str1 = "BB";
        String str2 = "Aa";
        System.out.println(str1.hashCode() + ", " + str2.hashCode()); // both are 2112
    }

    @Override
    public String toString() {
        return "objectDemo" + seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectDemo that = (ObjectDemo) o;
        return seq == that.seq;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seq);
    }
}
