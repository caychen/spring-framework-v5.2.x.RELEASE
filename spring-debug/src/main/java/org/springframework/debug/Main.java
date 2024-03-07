package org.springframework.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Caychen
 * @Date: 2024/3/6 15:32
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-base.xml");
		User user = ctx.getBean("user", User.class);

		System.out.println(user);
	}
}
