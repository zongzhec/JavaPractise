package zongzhe.design_pattern;

/**
 * @see <a href="https://www.bilibili.com/video/av83956740?p=225">学习教程</a>
 * @see <a href="https://github.com/zongzhec/JavaPractise">源码</a>
 *
 * 模板设计模式
 * <p>
 * 模板：定好了框架、格式、结构。具体的内容需要使用者来填写。
 * 例如简历模板、论文模板、请假条的模板
 * <p>
 * 在开发中，遇到这样的情况：当解决某个问题时，总体的代码结构是确定的，步骤也是确定的。
 * 只是其中的一小步步骤具体不确定，那么我们可以吧这个不确定的步骤设计为抽象方法，让使用者去实现。
 * <p>
 * 例如：编写一个类，具有一个功能，可以计算“任意”一段代码的运行时间。
 * 步骤：
 * 1. 获取开始时间
 * 2. 执行代码
 * 3. 获取结束时间
 * 4. 计算时间差
 */
public class TemplateDemo {
    public static void main(String[] args) {
        MyCalTime myCalTime = new MyCalTime();
        long runTime = myCalTime.getRunTime();
        System.out.println("运行时间： " + runTime + "毫秒");
    }
}

abstract class CalTime {
    public long getRunTime() {
        long start = System.currentTimeMillis();


        doWork();

        long end = System.currentTimeMillis();

        return end - start;
    }

    public abstract void doWork();
}

class MyCalTime extends CalTime {

    @Override
    public void doWork() {
        long sum = 0;
        for (int i = 1; i < 10000000; i++) {
            sum += i;
        }
        System.out.println("累加的和为： " + sum);
    }
}

class OtherCalTime extends CalTime {

    @Override
    public void doWork() {
        // Some other work
    }
}
