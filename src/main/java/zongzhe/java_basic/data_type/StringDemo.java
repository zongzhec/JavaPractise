package zongzhe.java_basic.data_type;

public class StringDemo {

    public static void main(String args[]){
        // Output "*    *"
        System.out.println("*    *");
        System.out.println('*' + '\t' + '*');
        System.out.println("*" + '\t' + '*'); // not working, because + will be connection mark only in String.
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*"); // not working, because + will be connection mark only in String.
        System.out.println("*" + "\t" + "*");
    }
}
