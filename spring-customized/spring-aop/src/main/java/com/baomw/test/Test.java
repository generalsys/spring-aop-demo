package com.baomw.test;

import com.baomw.config.Appconfig;
import com.baomw.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * √Ë ˆ:
 *
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                    = new AnnotationConfigApplicationContext(Appconfig.class);
        IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
        indexDao.query();
        System.out.println("");
    }
}
