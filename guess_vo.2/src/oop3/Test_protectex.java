package oop3;

import javax.xml.bind.annotation.XmlElement.DEFAULT;

public class Test_protectex {
	
	protected void method() {
		
		System.out.println("���� protected ����");
	}

	  DEFAULT  method2() {
		 
		 System.out.println("default");
		return null;
	}
}
