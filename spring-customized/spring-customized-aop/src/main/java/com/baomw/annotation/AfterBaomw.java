package com.baomw.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ����:
 * �Զ������֪ͨע����
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterBaomw {
    String value() default "";
}
