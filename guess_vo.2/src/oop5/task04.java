package oop5;

public class task04 {

	/**
	 作业练习4
	 
public interface InterfacePhone {

	public void dial(String phoneNumber); //拨通电话
	
	public void chat(Object o);//通话
	
	public void hangup();//通话完毕，挂电话
	
	}

       该接口可不是只有一个职责，它包含了两个职责：一个是协议管理，一个是数据传送。
       
	hangup()两个方法实现的是协议管理，分别负责拨号接通和挂机；
	
	chat()实现的是数据的传送，把我们说的话转换成模拟信号或数字信号传递到对方。
	
       协议接通的变化会引起这个接口或实现类的变化吗？的变化会引起这个接口或实现类的变化吗？
       
       如果按单一职责原则你会怎么重构这个设计？
      
      没思路。
	 */
}
