package task1.core.service.impl;

import task1.core.service.UserService;

public class PersonService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("the person name : "+name+" Saved");
    }

    @Override
    public void update(String name) {
        System.out.println("the person name : "+name+"v updated");
    }
}
