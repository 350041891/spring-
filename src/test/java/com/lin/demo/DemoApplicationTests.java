package com.lin.demo;

import com.lin.demo.domain.User;
import com.lin.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.lin.demo.dao")
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void saveUser() {
		User user = new User();
		user.setAge(11);
		user.setName("lhy");
		user.setPhone("13860796620");
		userService.insertUser(user);
	}


}
