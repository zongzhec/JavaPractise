package zongzhe.java_basic.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@EnableAutoConfiguration // 自动bean注入
@ComponentScan //启动自动搜索bean
public class SpringDemo {
    public static void main(String[] args) {
        // 1. 创建IOC容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 从IOC容器中获取HelloWorld对象
        SpringHelloWorldDemo helloWorld = (SpringHelloWorldDemo) ioc.getBean("helloWorld");
        // 3.调用sayHello方法
        helloWorld.sayHello();
        SpringApplication.run(SpringDemo.class, args);
    }
}

