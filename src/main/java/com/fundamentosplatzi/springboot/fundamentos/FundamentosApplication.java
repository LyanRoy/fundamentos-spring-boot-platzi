package com.fundamentosplatzi.springboot.fundamentos;

import component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	ComponentDependency componentDependency = (ComponentDependency)context.getBean(ComponentDependency.class);

	public FundamentosApplication(ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
/*
	@Autowired
	private ComponentDependency componentDependency;
*/
	/*
	public FundamentosApplication(ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();

	}

 */
}
