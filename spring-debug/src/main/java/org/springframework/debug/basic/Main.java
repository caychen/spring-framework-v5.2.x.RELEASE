package org.springframework.debug.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Caychen
 * @Date: 2024/3/6 15:32
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-basic.xml");
		Object obj = ctx.getBean("myFactoryBean");
		System.out.println(obj);

//		Object obj2 = ctx.getBean("&myFactoryBean");
//		System.out.println(obj2);
	}
}
