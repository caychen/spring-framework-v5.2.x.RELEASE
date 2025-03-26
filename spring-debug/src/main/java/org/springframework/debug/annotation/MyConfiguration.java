package org.springframework.debug.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Caychen
 * @Date: 2025/3/23 20:40
 * @Description:
 */
@Configuration
public class MyConfiguration {

	@Bean("person")
	public Person person(){
		return new Person();
	}

	@Bean("person1")
	public Person person1() {
		return person();
	}
}
