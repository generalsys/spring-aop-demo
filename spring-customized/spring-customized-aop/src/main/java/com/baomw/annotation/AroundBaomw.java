package com.baomw.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ����:
 * �Զ��廷��֪ͨ����ע����
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AroundBaomw {
    String value() default "";
}
