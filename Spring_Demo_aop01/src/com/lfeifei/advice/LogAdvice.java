package com.lfeifei.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author :feifei
 * @date 2018/11/18 20:58
 * @Deprecated
 */
public class LogAdvice {

    /**
     * 前置通知，在方法执行之前，自动执行
     * @param jp
     */
    public void beforeMethod(JoinPoint jp) {
        Object[] args = jp.getArgs();
        /**获取目标对象*/
        jp.getTarget();
        /**方法名*/
        String name = jp.getSignature().getName();
        System.out.println("[系统日志1]" + new Date() + "方法:" + name + "参数" + Arrays.toString(args));

    }

    /**
     * 后置通知: 获得一个方法的返回值
     * @param jp
     * @param rs
     */
    public void afterReturnningMethod(JoinPoint jp,Object rs) {
        Object[] args = jp.getArgs();
        /**获取目标对象*/
        jp.getTarget();
        /**方法名*/
        String name = jp.getSignature().getName();
        System.out.println("[系统日志2]" + new Date() + "方法名" + name + "参数" + Arrays.toString(args) + "返回值" + rs);
    }

    /**
     * 最终通知
     * @param jp
     */
    public void afterMethod(JoinPoint jp) {
        /**方法名*/
        String name = jp.getSignature().getName();
        System.out.println("[系统日志3]" +new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date())  + ",方法名" + name);
    }

    /**
     * 异常通知
     * @param jp
     * @param ex
     */
    public void throwExceptionMethod(JoinPoint jp,Exception ex) {
        /**方法名*/
        String name = jp.getSignature().getName();
        System.out.println("[系统日志4]" + new Date() + ",名字" + name + ",抛出异常信息:" + ex.getMessage());
    }

    /**
     * 环绕通知
     * @param jp
     * @return
     * @throws Throwable
     */
    public Object aroundMethod(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around环绕前通知......");
        Object obj = jp.proceed();
        System.out.println("around环绕后通知......");
        return obj;
    }
}
