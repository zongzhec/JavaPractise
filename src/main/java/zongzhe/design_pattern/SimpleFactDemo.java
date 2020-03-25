package zongzhe.design_pattern;

public class SimpleFactDemo {
    public static void main(String[] args) {
        // 没有工厂的时候
        BMW bmw = new BMW();

        // 使用工厂类
        Car car = SimpleFactory.getCar("BMW");
        car.run();
    }
}

interface Car {
    void run();
}

class BMW implements Car {

    @Override
    public void run() {
        System.out.println("BMW");
    }
}

class Benz implements Car {

    @Override
    public void run() {
        System.out.println("Benz");
    }
}

class Audi implements Car {

    @Override
    public void run() {
        System.out.println("Audi");
    }
}

class SimpleFactory {
    public static Car getCar(String type) {
        switch (type) {
            case "BMW":
                return new BMW();
            case "Benz":
                return new Benz();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}
