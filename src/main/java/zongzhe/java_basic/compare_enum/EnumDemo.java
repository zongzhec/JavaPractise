package zongzhe.java_basic.compare_enum;

public class EnumDemo {
    public static void main(String[] args) {
//        Week w = new Week(); // Error: 构造器是私有的
        Week weekday = Week.FRIDAY;
        System.out.println(weekday);

        switch (weekday){
            case FRIDAY:
                System.out.println("switch Friday");
                break;
            default:
                System.out.println("default");
        }
    }
}

enum Week {
    //    private String name; // Error: 首行必须是枚举类型的常量对象列表
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY("This is Friday", "Happy Day!"),
    SATURDAY, SUNDAY;
    private String name;
    private String desc;

    private Week(){

    }

    private Week(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override // 重写的是Enum的toString方法
    public String toString(){
        return name + ": " + desc;
    }

}
