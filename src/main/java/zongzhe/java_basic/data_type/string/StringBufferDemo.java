package zongzhe.java_basic.data_type.string;

public class StringBufferDemo {

    public static void main(String[] args) {

//        checkStrBufferLenAfterConstruct();
//
//        checkStrBufferFuncs();

        compareAppendTime();

    }


    private static void checkStrBufferLenAfterConstruct() {
        // Check StringBuffer's length after construction
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("12345678901234567890");

        System.out.println("StringBuffer() length: " + sb1.length()); // 0
        System.out.println("StringBuffer() capacity: " + sb1.capacity()); // 16
        System.out.println("StringBuffer(\"12345678901234567890\") length: " + sb2.length()); // 20
        System.out.println("StringBuffer(\"12345678901234567890\") capacity: " + sb2.capacity()); // 36 = 20 + 16

    }

    public static void checkStrBufferFuncs() {

        String str = "hello";
        StringBuffer sb = new StringBuffer("hello");

        System.out.println("str: " + str); // str: hello
        System.out.println("sb: " + sb); // sb: hello world

        sb.append(1).append('c').append("asd").append(54.26);
        System.out.println("sb after append: " + sb); // hello world1casd54.26

        sb.insert(2, "insert");
        System.out.println("sb after insert: " + sb); // heinsertllo world1casd54.26

        sb.delete(2, 5);
        System.out.println("sb after delete: " + sb); // heertllo world1casd54.26

        sb.reverse();
        System.out.println("sb after reverse: " + sb); // 62.45dsac1dlrow olltreeh
    }

    public static void appendStr(String str, StringBuffer sb) {
        str += " world";
        sb.append(" world");
    }

    private static void compareAppendTime() {
        // 测试在append String的过程中，String, StringBuffer, 和StringBuilder的效率问题。
        String s = "";
        StringBuffer sBuffer = new StringBuffer(s);
        StringBuilder sBuilder = new StringBuilder(s);

        stringAppend(s);
        stringBufferAppend(sBuffer);
        stringBuilderAppend(sBuilder);

    }

    private static void stringAppend(String s) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            s += i;
        }
        long endTime = System.currentTimeMillis();
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("String 拼接用时： " + (endTime - startTime)); // 22662毫秒
        System.out.println("String 内存耗费： " + memory); // 395409304字节，每次都会new一个对象
    }

    private static void stringBufferAppend(StringBuffer sBuffer) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            sBuffer.append(i);
        }
        long endTime = System.currentTimeMillis();
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuffer 拼接用时： " + (endTime - startTime)); // 16
        System.out.println("StringBuffer 内存耗费： " + memory); // 8489264
    }

    private static void stringBuilderAppend(StringBuilder sBuilder) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            sBuilder.append(i);
        }
        long endTime = System.currentTimeMillis();
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuilder 拼接用时： " + (endTime - startTime)); // 8
        System.out.println("StringBuilder 内存耗费： " + memory); // 8489264
    }
}
