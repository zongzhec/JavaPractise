package zongzhe.java_basic.oop.inheritence;

public class Person {
    public String name = "Zongzhe_as_Person";
    private int age;

    // 无参构造
    public Person() {

    }

    // 有参构造
    public Person(String name, int age) {
        super();
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "Name: " + name + ", age: " + age;
    }

    public Object returnObject(){
        return null;
    }
}
