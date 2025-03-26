package org.springframework.debug.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.debug.entity.User;

/**
 * @Author: Caychen
 * @Date: 2024/3/15 11:08
 * @Description:
 */
public class MyFactoryBean implements FactoryBean<User>, InitializingBean {

	private User user;
	@Override
	public User getObject() throws Exception {
		return this.user;
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(".......................");
		user = new User();
		user.setName("zhangsan");
	}
}
