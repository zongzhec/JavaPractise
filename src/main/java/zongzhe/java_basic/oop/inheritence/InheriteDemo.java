package zongzhe.java_basic.oop.inheritence;

/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=188"/>
 */
public class InheriteDemo {

    public static void main(String[] args) {
        Student stu = new Student("Zong", 23, 99);
        // Student stu2 = new Student("Zongzhe", 25); // Error: Student does not contain
        stu.setName("Zongzhe");
        stu.setAge(25);
        System.out.println(stu.getInfo());

        stu.setScore(90);
    }
}
