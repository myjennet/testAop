package com.testAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class TestAop {
	
	@Autowired
	AopTest aopTestImpl;
	
	@Test
	public void test01(){
		aopTestImpl.print("hehd dh ");
		System.out.println("test.aop");
	}

}
