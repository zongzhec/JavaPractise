package zongzhe.java_basic.exception;

public class TryCatchDemo {

    public static void main(String[] args) {
        System.out.println("returnInFinally: " + returnInFinally()); // i = 40
        System.out.println("returnInFinally: " + returnNotInFinally()); // i =20

    }

    public static int returnInFinally() {
        int i = 10;
        try {
            i = 20;
            System.out.println("priocessing try, i = " + i);
            return i;
        } catch (Exception e) {
            i = 30;
            System.out.println("priocessing catch, i = " + i);
            return i;
        } finally {
            i = 40;
            System.out.println("priocessing dianlly, i = " + i);
            return i;
        }
    }

    public static int returnNotInFinally() {
        int i = 10;
        try {
            i = 20;
            System.out.println("priocessing try, i = " + i);
            return i;
        } catch (Exception e) {
            i = 30;
            System.out.println("priocessing catch, i = " + i);
            return i;
        } finally {
            i = 40;
            System.out.println("priocessing dianlly, i = " + i);

        }
    }
}
