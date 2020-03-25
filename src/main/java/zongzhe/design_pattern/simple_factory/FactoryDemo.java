package zongzhe.design_pattern.simple_factory;

public class FactoryDemo {
    public static void main(String[] args) {
        // 多态引用，左边是接口的类型，右边赋值的是实现类的对象
        Car c = BMWFactory.getBMW();
        c.run();
    }
}

// 每一个实现类，单独编写工厂
class BMWFactory {
    public static BMW getBMW() {
        return new BMW();
    }
}

// 另一种写法
interface CarFactory {
    Car getCar();
}

class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
