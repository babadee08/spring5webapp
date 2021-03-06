package com.ceenuts.spring5webapp;

import com.ceenuts.spring5webapp.controllers.*;
import com.ceenuts.spring5webapp.services.GreetingService;
import com.ceenuts.spring5webapp.services.I18nSpanishGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		System.out.println("-------- Pets");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("-------- Profiles");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

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

		System.out.println("Testing Scoped Beans");
		GreetingService greetingService = (GreetingService) ctx.getBean("i18nService");
		I18nSpanishGreetingService greetingService2 = (I18nSpanishGreetingService) ctx.getBean("i18nService");
		System.out.println("Memory Address first: " + greetingService);
		System.out.println("Memory Address second: " + greetingService2);
		System.out.println(greetingService2.getEmail());
	}

}
