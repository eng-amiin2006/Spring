package task2.core.service.impl;

import task2.core.service.UserService;

public class AccountServiceImpl implements UserService {

    private UserService user;
     public AccountServiceImpl(UserService user){
         this.user = user;

     }
    @Override
    public void save(String name) {
            user.save(name);
     }
}
