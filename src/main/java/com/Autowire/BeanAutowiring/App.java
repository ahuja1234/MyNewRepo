package com.Autowire.BeanAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  App  
{
    public static void main( String[] args )
    {    
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Player s =(Player) ctx.getBean("play"); 
    	s.printInfo();     
    }
}
