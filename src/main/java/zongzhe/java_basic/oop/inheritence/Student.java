package zongzhe.java_basic.oop.inheritence;

public class Student extends Person {

    public String name = "Zongzhe_as_Student";
    private int score; // 扩展父类中没有的属性

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
//        System.out.println("name: " + name); // Error: 如果父类中关于这个方法和属性是私有，则子类中不能直接使用。
        return "name: " + super.getName(); // 间接调用
    }

    @Override
    public String returnObject() {
        return "";
    }

    public void printName(String name) {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + name);
    }
}
