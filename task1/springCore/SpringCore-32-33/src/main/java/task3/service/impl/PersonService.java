package task3.service.impl;

import task3.service.UserService;

public class PersonService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("the person name saved is : "+ name);
    }
    public void init() {
        System.out.println("Init Method Called");
    }

    public void destroy() {
        System.out.println("Destroy Method Called");
    }
}
