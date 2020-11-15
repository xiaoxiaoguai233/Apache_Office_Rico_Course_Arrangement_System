package com.ruike.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴泽胜
 * @FileName MapParameter
 * @date 2020-11-12 8:50 下午
 * @Software: IntelliJ IDEA
 */

public class MapParameter {

    private Map<String, Object> paramMap = new HashMap<String, Object>();

    private MapParameter() {
    }

    ;

    /**
     * 在主函数开始时调用，返回一个实例化对象，此对象是static的，
     * 在内存中保留着它的引用，即内存中有一块区域专门用来存放静态方法和变量，
     * 可以直接使用，调用多次返回同一个对象。
     *
     * @return
     */
    public static MapParameter getInstance() {
        return new MapParameter();
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }

    public MapParameter put(String key, Object val) {
        paramMap.put(key, val);
        return this;
    }

    // 重写Map导入方式
    public MapParameter put(Map<String, Object> map) {

        for (Map.Entry<String, Object> enty : map.entrySet())
            paramMap.put(enty.getKey(), enty.getValue());
        return this;
    }
}
