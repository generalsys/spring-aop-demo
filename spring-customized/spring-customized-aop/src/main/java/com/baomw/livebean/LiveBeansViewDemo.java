package com.baomw.livebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

import static org.springframework.context.support.LiveBeansView.MBEAN_DOMAIN_PROPERTY_NAME;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR> 修改记录
 * <BR>-----------------------------------------------
 * <BR> 修改日期 修改人 修改内容
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

        System.out.println("按任意键。。。");
        System.in.read();
        context.close();

    }
    /**
    * 委派到MBeanServer里了
    * */
}
