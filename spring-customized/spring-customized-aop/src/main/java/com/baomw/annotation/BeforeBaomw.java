package com.baomw.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ����:
 * �Զ���ǰ��֪ͨע����
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface BeforeBaomw {
    String value() default "";
}
