package org.vmware.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vmware.spring.service.ShapeService;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape = (ShapeService)ctx.getBean("shapeservice");
		
		System.out.println(shape.getCircle().getName());
		System.out.println("--------------------------");
		System.out.println(shape.getCircle().getFname());
		System.out.println("--------------------------");
		shape.getCircle().getAll(100,"dashvanth","kannan");
		System.out.println("--------------------------");
		System.out.println(shape.getTriangle().getName());
	}

}
