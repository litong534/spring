package com.pomelo.entity;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pomelo.service.UserService;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)applicationContext.getBean("userService");
		User u = new User();
		u.setName("qwert");
		u.setPassword("qwert");
		service.addUser(u);
		applicationContext.destroy();
	}

}
