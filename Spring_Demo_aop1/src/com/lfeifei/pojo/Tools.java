package com.lfeifei.pojo;

import org.springframework.stereotype.Component;

/**
 * @author :feifei
 * @date 2018/11/17 22:26
 * @Deprecated
 */
@Component("tools")
public class Tools {
    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public double add(double a,double b) {
        return a + b;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public double jian(double a,double b) {
        return a - b;
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return
     */
    public double cheng(double a,double b) {
        return a * b;
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return
     */
    public double chu(double a,double b) {
        return a / b;
    }
}
