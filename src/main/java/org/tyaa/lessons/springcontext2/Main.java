package org.tyaa.lessons.springcontext2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println(ac.getBean("unit"));
        System.out.println(ac.getBean("unit", Unit.class).id);
    }
}
