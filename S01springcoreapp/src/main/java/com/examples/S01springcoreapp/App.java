package com.examples.S01springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//demo1();
    	//demo2();
    	//demo3();
    	demo4();
    }
    private static void demo4() {
      	 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig4.xml");
      	EmployeeDao dao=(EmployeeDao)ctx.getBean("empdao");
      	 System.out.println(dao);
       }
    private static void demo3() {
   	 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig3.xml");
   	Computer c1=(Computer)ctx.getBean("homecomputer");
    System.out.println( c1 );
    Computer o1=(Computer)ctx.getBean("officecomputer");
    System.out.println( o1);
    }
    private static void demo2() {
    	 ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig2.xml");
     Car c1=(Car)ctx.getBean("car");
     System.out.println( c1.hashCode());
     Car c2=(Car)ctx.getBean("car");
     System.out.println( c2.hashCode() );
     Object b1=ctx.getBean("bank");
     System.out.println( b1.hashCode() );
     Object b2=ctx.getBean("bank");
     System.out.println( b2.hashCode() );
     Object b3=ctx.getBean("bank");
     System.out.println( b3.hashCode());
    }
   public static void demo1() {
        System.out.println( "Hello World!" );
       //     Employee emp=new Employee();
        //         emp.setId(1);
        //           emp.setName("Rashika");
       //           System.out.println(emp);
     
        // create spring container
      ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig.xml");
// ask the container for employee bean
      Employee emp1=(Employee) ctx.getBean("emp1");
      System.out.println(emp1);
      Employee emp2=(Employee) ctx.getBean("emp2");
      System.out.println(emp2);

      Employee emp3=(Employee) ctx.getBean("emp3");
      System.out.println(emp3);
      Employee emp4=(Employee) ctx.getBean("emp4");
      System.out.println(emp4);
      Employee emp5=(Employee) ctx.getBean("emp5");
      System.out.println(emp5);
      Employee emp6=(Employee) ctx.getBean("emp6");
      System.out.println(emp6);
      Employee emp7=(Employee) ctx.getBean("emp7");
      System.out.println(emp7);
      Employee emp8=(Employee) ctx.getBean("emp8");
      System.out.println(emp8);
      Employee emp9=(Employee) ctx.getBean("emp9");
      System.out.println(emp9);


      
     
    }
}
