package zongzhe.java_basic.oop.interfaces;

/**
 * 实现Java的Comparable接口
 *
 * @see <a href="https://www.bilibili.com/video/av83956740?p=228">视频地址</a>
 * <p>
 * 希望学生类的对象，可以比较大小。
 */
public class Student implements Comparable {
    private String name;
    private int score;

    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    // 按照成绩比较大小
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student otherStu = (Student) o;
            return Integer.compare(this.score, otherStu.score);
        } else {
            throw new RuntimeException("obj不是学生对象");
        }

    }

    public static void sort(Object[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                Comparable pre = (Comparable) arr[j]; // 如果这个位置没有报错，说明arr[j]这个元素的类型是实现了compareTo方法的。
                if (pre.compareTo(arr[j + 1]) > 0) {
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
