package zongzhe.java_basic.oop.polymorphism;

public class Man extends Person{
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void walk(){
        System.out.println("Man is walking.");
    }

    public void smoke(){
        System.out.println("Man is smoking.");
    }
}
