package zongzhe.java_basic.oop.polymorphism;

public class Woman extends Person {
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private int age;
    public void walk() {
        System.out.println("Woman is walking.");
    }

    public void shop() {
        System.out.println("Woman is shopping.");
    }
}
