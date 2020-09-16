package com.baomw.livebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

import static org.springframework.context.support.LiveBeansView.MBEAN_DOMAIN_PROPERTY_NAME;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR> �޸ļ�¼
 * <BR>-----------------------------------------------
 * <BR> �޸����� �޸��� �޸�����
 * </PRE>
 *
 * @author wangju
 * @version 1.0
 * @since 1.0
 */
public class LiveBeansViewDemo {

    public static void main(String[] args) throws IOException {

        System.setProperty(MBEAN_DOMAIN_PROPERTY_NAME,"com.baomw");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LiveBeansViewDemo.class);
        context.refresh();

        System.out.println("�������������");
        System.in.read();
        context.close();

    }
    /**
    * ί�ɵ�MBeanServer����
    * */
}
