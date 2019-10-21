package task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class Test_task03 {
	
	/**
创建代理类 PersonProxy,PersonProxy的在  
代理Person类的所有setter方法时, 把方法的调用时间、方法名称写入到文本文件中,每一行日志的格式为：

• 时间：2012-09-01 23：34：24;方法名称：setName;参数：张无忌

	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Person p =new Person();
		
		MyInvocationHandler handler =new MyInvocationHandler(p);
		
		PersonProxy pp =(PersonProxy)
				Proxy.newProxyInstance(
						p.getClass().getClassLoader(), 
						  p.getClass().getInterfaces(),
						    handler);
		pp.setName("李哥");
		
		String data = p.getName();
		save(data);
	}
	//保存数据
	public static void save(String data) throws IOException{
		
		File file =new File("M:/person.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fileWriter =new FileWriter(file);
		System.out.println("写入信息为："+data);
		fileWriter.write(data);
		fileWriter.close();
		System.out.println("写入成功！");
	}

}
