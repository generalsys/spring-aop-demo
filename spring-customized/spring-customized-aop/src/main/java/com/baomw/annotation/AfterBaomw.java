package com.baomw.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 描述:
 * 自定义后置通知注解类
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterBaomw {
    String value() default "";
}
