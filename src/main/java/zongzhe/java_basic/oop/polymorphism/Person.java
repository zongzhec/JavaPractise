package zongzhe.java_basic.oop.polymorphism;

public class Person {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void walk(){
        System.out.println("Person is walking.");
    }
}
