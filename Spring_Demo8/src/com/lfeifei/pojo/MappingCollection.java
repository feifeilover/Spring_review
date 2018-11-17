package com.lfeifei.pojo;

import java.util.Map;
import java.util.Properties;

/**
 * @author :feifei
 * @date 2018/11/17 21:58
 * @Deprecated :映射集合
 */
public class MappingCollection {
    /**
     * map
     */
    private Map<String,Integer> map;

    /**
     * properties
     */
    private Properties props;

    /**
     * set方式注入
     * @param map
     */
    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    /**
     * set方式注入
     * @param props
     */
    public void setProps(Properties props) {
        this.props = props;
    }

    public void printMap() {
        System.out.println("打印map集合" + map);
    }

    public void printProps() {
        System.out.println("打印props" + props);
    }
}
