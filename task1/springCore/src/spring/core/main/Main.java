package spring.core.main;

import spring.core.service.impl.MangerService;
import spring.core.service.impl.PersonService;

public class Main {
public static void main (String[] args) {
	
	ClassPathXmlApplicationContext applicationContext = new 
			ClassPathXmlApplicationContext("applicationContext.xml");

	PersonService personService	applicationContext.getBean(personService,PersonService.class);
	personService.save("amin");
	
	MangerService mangerService applicationContext.getBean(mangerService,MangerService.class);
	mangerService.update("ahmed");
}
}
