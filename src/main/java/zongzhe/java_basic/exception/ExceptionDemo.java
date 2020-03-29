package zongzhe.java_basic.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 写一段程序，要求发生VirtualMachineError（即OOMError或StackOverflowError）
        // StackOverFlowError
        callMySelf();
        // OOM Error
        getHugeList();

        // 写一段程序，要求发生RuntimeException
        // NPE
        getNPE();
        // IndexOutOfBoundsException
        getIndexOutOfBound();

        // 写一段程序，要求发生编译时异常
        // InterruptedException
        getThreadException();
    }

    private static void callMySelf() {
        callMySelf();
    }

    private static void getHugeList() {
        Object[] arr = new Object[Integer.MAX_VALUE];
        System.out.println(arr.length);
    }

    private static void getNPE() {
        String str = null;
        System.out.println(str.length());
    }

    private static void getIndexOutOfBound() {
        int[] arr = new int[5];
        System.out.println(arr[6]); // 编译器不会报错，但是运行时会出错
    }

    private static void getThreadException() {
        try {
            Thread.sleep(1000); // 编译器报错并强制要求加try catch或throws语句
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
