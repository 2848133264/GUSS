package task02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**


�Զ���ע��@service,��ע��ʹ�����༶���ϣ�ͨ

������ɨ������@service������ע�����ʵ����

����ʵ�����浽������

����ӡ��Щ���ʵ����Ϣ
* @author Administrator
*
*/

@service(value ="java", key = "0007")
public class Examble{
	
	public String toString() { // ��дtoString()����
		return "Hello Annotation!!!" ; // ������Ϣ
		
	}
	
}


