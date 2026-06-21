package spring.core.service;

public class Container {
	
	private UserService user ;
	
	public Container(UserService user) {
		this.user = user;
	}

	public void save (String name) {
		user.save(name);
	}
	
	public void update (String name) {
		user.update(name);
	}
	
	
}
