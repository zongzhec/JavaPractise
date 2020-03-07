package zongzhe.variable;

/**
 * see <a href ="https://www.bilibili.com/video/av83956740?p=42"/>
 * 强制类型转换：将容量大的数据类型的变量转换为容量小的数据类型变量，需要使用强转符: ()
 * 注意：使用强转符，可能会损失精度。
 */

public class ForceConvertDemo {

    public static void main(String[] args) {
        int intNum = 12;
        byte byteNum = (byte) intNum;
        System.out.println(byteNum);

        // 损失精度情况一：丢失精度
        float floatNum = 12.99F;
        int intNum2 = (int) floatNum;
        System.out.println(intNum2); // 12

        // 损失精度情况二：数据溢出
        int intNum3 = 128;
        byte byteNum2 = (byte) intNum3;
        System.out.println(byteNum2); // -128
    }
}
