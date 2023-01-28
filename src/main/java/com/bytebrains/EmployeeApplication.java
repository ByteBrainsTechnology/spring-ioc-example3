package com.bytebrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApplication {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee e = (Employee) context.getBean("accountant");
		e.work();
	}
}
