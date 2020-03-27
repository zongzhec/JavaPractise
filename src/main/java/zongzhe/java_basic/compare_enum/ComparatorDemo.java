package zongzhe.java_basic.compare_enum;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, 89, "Zongzhe");
        arr[1] = new Student(3, 90, "Zong");
        arr[2] = new Student(1, 75, "ZZ");

        // 排序要求一： 按照学号排序，需要Comparable的compareTo
        Arrays.sort(arr);
        System.out.println("按照学号自然排序");
        for (Student stu : arr) {
            System.out.println(stu);
        }

        // 排序要求二：按照成绩定制排序
        System.out.println("按照成绩定制排序");
        class StudentScoreComparator implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                Student stu1 = (Student) o1;
                Student stu2 = (Student) o2;
                return stu1.getScore() - stu2.getScore();
            }
        }
        Arrays.sort(arr, new StudentScoreComparator());
        for (Student stu : arr) {
            System.out.println(stu);
        }

        // 排序要求二改进：使用匿名内部类按照成绩定制排序
        System.out.println("使用匿名内部类按照成绩定制排序");
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student stu1 = (Student) o1;
                Student stu2 = (Student) o2;
                return stu1.getScore() - stu2.getScore();
            }
        });
        for (Student stu : arr) {
            System.out.println(stu);
        }

    }
}

class Student implements Comparable {
    int id;
    int score;
    String name;

    public Student() {
    }

    public Student(int id, int score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        Student stu = (Student) obj;
        return this.id - stu.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
