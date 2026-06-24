package task2.core.service.impl;

import task2.core.service.UserService;

public class PersonService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("the person name saved is : "+ name);
    }
}
