package com.ceenuts.spring5webapp;

import com.ceenuts.spring5webapp.controllers.ConstructorInjectedController;
import com.ceenuts.spring5webapp.controllers.MyController;
import com.ceenuts.spring5webapp.controllers.PropertyInjectedController;
import com.ceenuts.spring5webapp.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------- Primary");
		System.out.println(myController.sayHello());

		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
