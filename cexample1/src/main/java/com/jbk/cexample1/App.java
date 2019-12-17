package com.jbk.cexample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Triangle triangle=(Triangle)ctx.getBean("triangle");
    	System.out.println(triangle);
    	triangle.draw();
    }
}
