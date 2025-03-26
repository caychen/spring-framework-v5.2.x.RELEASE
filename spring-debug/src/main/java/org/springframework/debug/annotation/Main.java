package org.springframework.debug.annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Caychen
 * @Date: 2025/3/23 16:23
 * @Description:
 */
public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-basic.xml");
		Object person = ctx.getBean("person");
		Object person1 = ctx.getBean("person1");
		System.out.println(person == person1);

	}
}
