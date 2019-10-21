package oop3;

import javax.xml.bind.annotation.XmlElement.DEFAULT;

public class Test_protectex {
	
	protected void method() {
		
		System.out.println("我是 protected 方法");
	}

	  DEFAULT  method2() {
		 
		 System.out.println("default");
		return null;
	}
}
