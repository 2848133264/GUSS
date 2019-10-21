package task02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**


自定义注解@service,该注解使用在类级别上，通

过反射扫描包类的@service创建该注解类的实例，

并将实例储存到集合中

最后打印这些类的实例信息
* @author Administrator
*
*/

@service(value ="java", key = "0007")
public class Examble{
	
	public String toString() { // 覆写toString()方法
		return "Hello Annotation!!!" ; // 返回信息
		
	}
	
}


