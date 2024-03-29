package com.gabriela.rest.webservice.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static  List<User> users = new ArrayList<>() ;
	private static int usersCount = 4;
	
	static {
		users.add(new User(1, "Gabriela", new Date()));
		users.add(new User(2, "Juan", new Date()));
		users.add(new User(3, "Hernan", new Date()));
		users.add(new User(4, "Adolfo", new Date()));
		
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User usuario:users) {
			if(usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}
	
	
}
