package zongzhe.java_basic.data_structure;

import java.util.Arrays;

/**
 * 实现自定义容器
 */
public class MyArrayList {
    private Object[] data; // 不知道装什么对象，所以用Object 来承载
    private int total; // 表示当前容器的大小，用于扩容和其他检查

    public MyArrayList() {
        data = new Object[10]; // 默认初始化大小
    }

    public void add(Object obj) {
        // 先检查容器是否已满
        if (total >= data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        // 填入数据
        data[total++] = obj;
    }

    public void remove(Object obj) {
        // 先查找位置
        int index = indexOf(obj);
        // 删除
        if (index != -1) {
            System.arraycopy(data, index + 1, data, index, total - index - 1);
            data[--total] = null;
        }
    }

    public int size() {
        return total;
    }

    public void set(Object oldObj, Object newObj) {
        int index = indexOf(oldObj);
        if (index != -1) {
            data[index] = newObj;
        }
    }

    public Object[] toArray() {
        return Arrays.copyOf(data, total);
    }

    public Object get(int index) {
        if (index < 0 || index >= total) {
            throw new IndexOutOfBoundsException("index outOfBound: " + index);
        }
        return data[index];
    }

    public int indexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < total; i++) { // 思考：此处的total能不能换成data.length()?
            if ((obj == null && data[i] == null) || (obj.equals(data[i]))) { // null 也是合法元素
                index = i;
                break;
            }
        }
        return index;
    }
}
