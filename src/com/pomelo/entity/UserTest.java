package com.pomelo.entity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pomelo.service.UserService;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)applicationContext.getBean("userService");
		User u = new User();
		u.setName("zhangsan");
		u.setPassword("zhangsan");
		service.addUser(u);
	}

}
