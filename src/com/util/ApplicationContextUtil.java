package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	
		private static ApplicationContext ac = null;
		private ApplicationContextUtil()
		{
			
		}
		static {
			ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		}
		
		public static ApplicationContext get()
		{
			return ac;
		}
}
