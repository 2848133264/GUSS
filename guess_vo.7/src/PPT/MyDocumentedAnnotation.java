package PPT;

import java.lang.annotation.Documented;

@Documented
public @interface MyDocumentedAnnotation {
	public String key();
	public String value();
}