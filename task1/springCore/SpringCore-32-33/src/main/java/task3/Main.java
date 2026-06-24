package task3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import task3.service.impl.PersonService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("container.xml");

        PersonService personService= context.getBean("task3",PersonService.class);
        personService.save("amin");

    }
}
