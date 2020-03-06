package zongzhe.variable;


/**
 * 基本数据类型变量间的运算：
 * 1. 自动类型提升：当容量小的数据类型变量与容量大的数据类型变量做运算时，结果为容量大的数据类型
 * 1.1. 此时的运算质包含基本数据类型中的7种，唯独不包括boolean型。
 * 1.2. 转换顺序为：byte/short/char -> int -> long -> float -> double。
 * 1.3. int以下的数据类型运算会自动转化成int。
 * 1.4. 容量的大小，不是指占用内存空间的大小，而是表数范围的大小。
 * 比如：long(8个字节)相较于 float(4个字节)算容量小的。
 * 2. 强制类型转换：是自动类型提升运算的逆运算
 *
 * @see <a href="https://www.bilibili.com/video/av83956740?p=41"></>
 */
public class VariableTypeConvertDemo {
    public static void main(String[] args) {
        autoTypePromote();

    }

    public static void autoTypePromote() {
        // from short to int
        short shortNum = 10;
        int intNum = 20;
        int intSum = shortNum + intNum;
        System.out.println(intSum);

        // from long to float
        long longNum = 123L;
        float floatNum = 123.3F;
        //long longSum = longNum + floatNum; // Fail to compile: 不兼容的类型: 从float转换到long可能会有损失
        float floatSum = longNum + floatNum;
        System.out.println(floatSum);

        // from char to int
        char charNum = 'a'; // ascii code value is 97
        int intSum2 = intNum + charNum;
        System.out.println(intSum2);

        // from byte to byte
        byte byteNum = 12;
        // short shortSum = byteNum + shortNum; // Fail to compile: 不兼容的类型: 从int转换到short可能会有损失
        int intSum3 = byteNum + shortNum;
        System.out.println(intSum3);

        // from byte to int
        byte byteNum2 = 13;
        // byte byteSum = byteNum + byteNum2; // Fail to compile: 不兼容的类型: 从int转换到byte可能会有损失
        int intSum4 = byteNum + byteNum2;
        System.out.println(intSum4);

    }
}
