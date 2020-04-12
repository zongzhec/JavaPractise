package zongzhe.java_basic.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemo {
    public static void main(String[] args) {
        // 创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = (Employee) ioc.getBean("employee");
        System.out.println(employee);

    }
}
