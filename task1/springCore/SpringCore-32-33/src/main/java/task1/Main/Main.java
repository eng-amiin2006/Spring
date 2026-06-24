package task1.Main;

import task1.core.service.impl.ManagerService;
import task1.core.service.impl.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("container.xml");
        PersonService personService = applicationContext.getBean("person",PersonService.class);

        personService.update("amin");
        personService.save("lol");

        ManagerService managerService = applicationContext.getBean("manager" , ManagerService.class);
        managerService.save("ahmed");
        managerService.update("woow");
    }
}
