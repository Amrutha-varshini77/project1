package ioc2basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbike {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
	Bike b1=(Bike) context.getBean("mybike");
	b1.price();
}
}
