package zongzhe.javaprac.data_type;

public class DataTypeDemo {

    public static void main(String args[]) {
        GenericDataType<String> gdtStr = new GenericDataType<>("string type");
        System.out.println(gdtStr.getName());
        System.out.println(GenericDataType.getK("str k"));
        System.out.println(GenericDataType.getK(456));

        GenericDataType<Integer> gdtInteger = new GenericDataType<>(123);
        System.out.println(gdtInteger.getName());
        System.out.println(GenericDataType.getK("str k"));
        System.out.println(GenericDataType.getK(456));
    }
}
