package com.testAop.impl;

import org.springframework.stereotype.Service;

import com.testAop.AopTest;

@Service
public class AopTestImpl implements AopTest {

	public String print(String str) {
		System.err.println("-------------call mothed---------------------");
		return str;
	}

}
