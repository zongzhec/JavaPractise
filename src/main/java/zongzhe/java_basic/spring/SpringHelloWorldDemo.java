package zongzhe.java_basic.spring;

public class SpringHelloWorldDemo {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello World " + name);
    }
}
