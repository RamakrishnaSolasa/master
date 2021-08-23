package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Helloworld implements InitializingBean, DisposableBean {

	public Helloworld() {
		System.out.println("Helloworld object created");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Conatiner has been closed " + "and I'm the destroy() method");

	}

//	public void init() throws Exception {
//        System.out.println(
//            "Bean HelloWorld has been "
//            + "instantiated and I'm "
//            + "the init() method");
//    }
// 
//    // This method executes
//    // when the spring container
//    // is closed
//    public void destroy() throws Exception {
//        System.out.println(
//            "Conatiner has been closed "
//            + "and I'm the destroy() method");
//    }

}
