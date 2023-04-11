package com.examples.stereotypess03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.stereotypess03.beans.Instructor;



public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/stereotypess03/springconfig.xml");
      	
        Instructor instructor=(Instructor)ctx.getBean("instructor");
              System.out.println(instructor );
        
    }
}
