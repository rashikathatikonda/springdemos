package com.examples.S06SpringORMDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.examples.S06SpringORMDemo.dao.ProductDao;
import com.examples.S06SpringORMDemo.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
    	//create();
  //  update();
    	delete();
    //	find();
    	//findAll();
    }

	private static void findAll() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
	   	 ProductDao productdao=(ProductDao)ctx.getBean("productdao");
	     Product product=productdao.find(6);
	 	 System.out.println("Product found"+product);	
		
	}

	private static void find() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
	   	 ProductDao productdao=(ProductDao)ctx.getBean("productdao");
	     Product product=productdao.find(6);
	 	 System.out.println("Product found"+product);		
	}
	private static void delete() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
	   	 ProductDao productdao=(ProductDao)ctx.getBean("productdao");
	     Product product=new Product();
	     product.setId(6);
	     product.setName("swapna");                         //deleting data
	     product.setDescription("ipad"); 
	     product.setPrice(12000); 
	     
	 	 productdao.delete(product);
	 	 System.out.println("Product deleted");	
	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
	   	 ProductDao productdao=(ProductDao)ctx.getBean("productdao");
	     Product product=new Product();
	     product.setId(7);
	     product.setName("swapna");                         //updating data
	     product.setDescription("car"); 
	     product.setPrice(1200000); 
	     
	 	 productdao.update(product);
	 	 System.out.println("Product updated");
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("com/examples/S06SpringORMDemo/springconfig.xml");
	   	 ProductDao productdao=(ProductDao)ctx.getBean("productdao");
	     Product product=new Product();
	     product.setId(3);
	     product.setName("rahul");                         //Inserting data
	     product.setDescription("computer"); 
	     product.setPrice(15000); 
	     
	 	 int result= productdao.create(product);
	 	 System.out.println("Product created"+result);
	}
}
