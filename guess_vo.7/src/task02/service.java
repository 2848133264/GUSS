package task02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value =ElementType.TYPE)
public @interface service{
	
	public String value();//���ý��յ�����
	public String key();
}


