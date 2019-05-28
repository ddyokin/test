package org.spring.example;

import org.spring.example.spring.TestBean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dzmitry Dziokin
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        TestBean1 bean = context.getBean(TestBean1.class);
        System.out.println(bean.getClass());
        bean.hello();
    }
}
