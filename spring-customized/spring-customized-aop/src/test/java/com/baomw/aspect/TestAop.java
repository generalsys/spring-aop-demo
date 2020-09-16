package com.baomw.aspect;

import com.baomw.annotation.AfterBaomw;
import com.baomw.annotation.AopJ;
import com.baomw.annotation.AroundBaomw;
import com.baomw.annotation.BeforeBaomw;
import org.springframework.stereotype.Component;

/**
 * ����:
 *
 */
@AopJ
@Component
public class TestAop {

    @BeforeBaomw("com.baomw.dao")
    public void testBefore(){
        System.out.println("before   ------------------  ���Գɹ���");
    }

    @AfterBaomw("com.baomw.dao")
    public void testAfter(){
        System.out.println("after   ------------------  ���Գɹ���");
    }

    @AroundBaomw("com.baomw.dao")
    public void testAround(){
        System.out.println("around   ------------------  ���Գɹ���");
    }
}
