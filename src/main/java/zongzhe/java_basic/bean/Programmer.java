package zongzhe.java_basic.bean;

public class Programmer extends Employee {
    private int memberId;
    private String status;
    private String equipment;

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public Programmer(int id, String name, int age, double salary, int memberId, String status, String equipment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }
}
