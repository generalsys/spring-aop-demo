package com.baomw.util;

import com.baomw.holder.ProxyBeanHolder;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ����:
 *
 */
public class ConfigurationUtil {

    /**
     * aop��ʶע����
     */
    public static final String AOP_POINTCUT_ANNOTATION
                                            = "com.baomw.annotation.AopJ";
    /**
     * ǰ��֪ͨע����
     */
    public static final String BEFORE
                                            = "com.baomw.annotation.BeforeBaomw";
    /**
     * ����֪ͨע����
     */
    public static final String AFTER
                                            = "com.baomw.annotation.AfterBaomw";
    /**
     * ����֪ͨע����
     */
    public static final String AROUND
                                            = "com.baomw.annotation.AroundBaomw";
    /**
     * ���������ȫ��Ŀ�������
     */
    public static volatile Map<String,List<ProxyBeanHolder>> classzzProxyBeanHolder = new ConcurrentHashMap<>();

}
