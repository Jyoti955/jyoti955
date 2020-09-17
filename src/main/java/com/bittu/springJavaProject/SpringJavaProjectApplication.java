package com.bittu.springJavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJavaProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJavaProjectApplication.class, args);
		Human jyoti=(Human)context.getBean("human");
		//Human jyoti=context.getBean(Human.class);
		//Human jyoti2=context.getBean(Human.class);
		//System.out.println(jyoti);
		//System.out.println(jyoti2);
		jyoti.eat();
	}

}
