package com.fhl.test.getSingleton;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestGetSingleton {
	
	@Test
	public void getSingleton(){

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigScanBean.class);
		final ServiceTest bean = annotationConfigApplicationContext.getBean(ServiceTest.class);
	}
}
