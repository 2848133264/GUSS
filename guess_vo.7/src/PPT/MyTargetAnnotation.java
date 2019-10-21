package PPT;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 此Annotation只能用在类上
@Retention(value = RetentionPolicy.RUNTIME)
// 此Annotation在类执行时依然有效
public @interface MyTargetAnnotation {
	// 定义一个key变量,默认值为“Hello”
	public String key() default "Hello";

	// 定义一个value变量,默认值为“张无忌”
	public String value() default "张无忌";
}