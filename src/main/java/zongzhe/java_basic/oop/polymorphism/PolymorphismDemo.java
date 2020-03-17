package zongzhe.java_basic.oop.polymorphism;

/**
 * @see <a href = "https://www.bilibili.com/video/av83956740?p=196" />
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        PolymorphismDemo pd = new PolymorphismDemo();
        Person p = new Man();
        p.walk();
//        p.smoke(); // Error: 编译时按照父类编译，所以无法找到子类的相应方法。

        // 多态数组的使用
        Person[] people = new Person[3];
        people[0] = new Person();
        people[1] = new Man();
        people[2] = new Woman();

        for (int i = 0; i < people.length; i++) {
            people[i].walk();
        }

        // 多态参数的使用
        Man man1 = new Man();
        man1.setId("ManID");
        Woman woman1 = new Woman();
        woman1.setId("WomanID");
        boolean flag = pd.compare(man1, woman1);
        System.out.println(flag);

        // 向上转型
        Person p2 = new Man();
        p2.setId("PersonID");

        // 向下转型
        Person p3 = new Person();
//        Woman woman = (Woman) p3; // Runtime Error: Man cannot be cast to zongzhe.java_basic.oop.polymorphism.Woman
        Woman woman2 = new Woman();
        woman2.setId("WomanIDwoman2");
        pd.printHobby(woman2);

        Man man3 = new Man();
        man3.setId("ManIDman3");
        pd.printHobby(man3);
    }

    public boolean compare(Person p1, Person p2) {
        return p1.getId().equals(p2.getId());
    }

    public void printHobby(Person p) {
        if (p instanceof Man){
            Man man = (Man) p;
            System.out.println(man.getId());
            man.smoke();
            return;
        }
        if (p instanceof Woman){
            Woman woman = (Woman) p;
            System.out.println(woman.getId());
            woman.shop();
        }

    }
}
