package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.ByeService;
import com.bean.UserService;
import com.util.ApplicationContextUtil;

public class Application {

	public static void main(String[] args) {
/* Section 1
		// use the traditional way to invoke the sayHello()
//		UserService us = new UserService();
//		us.setName("Ming");
//		us.sayHello();
		
		
//		By using Spring framework, I don't need to create new instance anymore
//		I can let Spring do this job for me.
//		Step1: add spring related jar to the build path
//		Step2: need a configuration file, applicationContext.xml; 
//				 copy the <beans ....></beans> from core spring doc
//				 usually we place it under the src folder in we create a plain java project.
//				 if you place the xml file in other folder, use / to determine the path
//				 for example: com/app/applicationContext.xml
//		Step3: configure the bean, see the xml file
//		Step4: get the container by create an instance of ApplicationContext. look it up in API
//				ApplicationContext is an interface, we need to create an instance of class which implements it.
//				in this case here, it is call ClassPathXmlApplicaitonContext, and pass the xml file as argument into its constructor.
//		Step5: Now we have a container which holds all the beans we created in the xml. time for us to take it out.
//				by calling the getBean(), which belongs to BeanFactory, which is also an interface.
//				return type: java.lang.Object	getBean(java.lang.String name)
//				method description: Return an instance, which may be shared or independent, of the specified bean.
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService myService = (UserService) ac.getBean("myService");
		myService.sayHello();
		ByeService byeService = ac.getBean("byeService", ByeService.class);
		byeService.sayBye();
*/
		
/* Section 2 
  		//to demostrate the realtionship between beans
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserService myService = (UserService) ac.getBean("myService");
		myService.sayHello();
*/
		
	
//		Section 3: Because applicationContext works like a container, who contains all the objects in the xml, 
//		every time we create a new instance of ApplicationContext, we create a new container, which we don't want to
//		we need to make sure that only one ApplicationContext object appears.
//		https://stackoverflow.com/questions/29862681/java-spring-multiple-applicationcontext
//		((UserService)ApplicationContextUtil.get().getBean("myService")).sayHello();
		
///*		
		// section 4: test bean life cycle
		System.out.println(1);
		ApplicationContext context = ApplicationContextUtil.get();
		System.out.println(2);
		((AbstractApplicationContext) context).registerShutdownHook();
				// this registerShutdownHook() method will close the context after bean's task. 
		System.out.println(3);
		UserService userService = context.getBean("myService", UserService.class);
		System.out.println(4);
		userService.sayHello();
		System.out.println(5);
		
//		((AbstractApplicationContext) context).close();
//*/	
	}

		
		
}
