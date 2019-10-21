package PPT;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Inherited // 此Annotation可以被继承
// 此Annotation在类执行时依然有效
@Retention(value = RetentionPolicy.RUNTIME)

public @interface MyInheritedAnnotation {
	public String name(); // 定义name变量接收内容
}