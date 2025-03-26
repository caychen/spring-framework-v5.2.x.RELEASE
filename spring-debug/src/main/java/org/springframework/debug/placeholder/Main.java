package org.springframework.debug.placeholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.debug.entity.User;
import org.springframework.util.PropertyPlaceholderHelper;

import java.util.Set;

/**
 * @Author: Caychen
 * @Date: 2024/3/7 14:47
 * @Description:
 */
public class Main {

	public static void main(String[] args) {
		// 在spring加载过程中，资源文件名中的占位符会被替换成Environment中的值
		// spring-${username}.xml ---> spring-Caychen.xml
		/**
		 * @see PropertyPlaceholderHelper#parseStringValue(String, PropertyPlaceholderHelper.PlaceholderResolver, Set)  
		 */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-${username}.xml");

		// 以下加载配置文件会报错
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-${username-${user.language}}.xml");
		User user = ctx.getBean("user", User.class);

		System.out.println(user);
	}
}
