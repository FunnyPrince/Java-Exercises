package com.day28;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author FunnyPrince_
 * @date 2021/5/4 - 0:23
 * 参考SuppressWarnings.java
 */

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.RUNTIME)//才会加载到内存中，只有加载到内存中，才可以通过反射获取
//要想通过反射调用注解，得用RUNTIME
public @interface MyAnnotation {

    String value() default "hello";
}
