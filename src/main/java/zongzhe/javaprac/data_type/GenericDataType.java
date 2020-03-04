package zongzhe.javaprac.data_type;

/**
 * @author Zongzhe
 * @see <a href="https://www.bilibili.com/video/av75676722?p=1</a>
 */
public class GenericDataType<T> {

    private T t;

    public GenericDataType(T name) {
        this.t = name;
    }

    public T getName() {
        return t;
    }

    public void setName(T name) {
        this.t = name;
    }

    public static <K> K getK(K k) {
        return k;
    }

}
