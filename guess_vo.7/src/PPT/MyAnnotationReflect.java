package PPT;

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME) // 此Annotation在类执行时依然有效
public @interface MyAnnotationReflect {
	
	public String key() default "Hello";// 定义一个key变量,默认值为“Hello”

	public String value() default "张无忌";// 定义一个value变量,默认值为“张无忌”
}
