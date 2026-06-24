package task2.core.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.core.service.impl.AccountServiceImpl;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("container.xml");

        AccountServiceImpl accountService = applicationContext
                    .getBean("accountService",AccountServiceImpl.class);
        accountService.save("amin");


    }
}
