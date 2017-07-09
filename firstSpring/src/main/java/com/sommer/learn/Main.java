package main.java.com.sommer.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext:读取系统XML配置文件
        ApplicationContext apc = new ClassPathXmlApplicationContext("springXML/HelloWorld.xml");
        HelloWorld hello = apc.getBean("HelloWorld",HelloWorld.class);
        HelloWorld hello2_default = apc.getBean("Hello2_default",HelloWorld.class);
        HelloWorld hello2_input = apc.getBean("Hello2_input",HelloWorld.class);


        System.out.println(hello.sayHi());
        System.out.println(hello2_default.sayHi());
        System.out.println(hello2_input.sayHi());

    }

}