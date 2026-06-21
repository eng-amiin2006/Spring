package spring.core.service.impl;

import spring.core.service.UserService;

public class MangerService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("name saved: "+ name);
		
	}

	@Override
	public void update(String name) {
		System.out.println("name updated: "+ name);
	}

}
