package com.ruike.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴泽胜
 * @FileName MapControl
 * @date 2020-11-12 8:28 下午
 * @Software: IntelliJ IDEA
 */

public class MapControl {

    private Map paramMap = new HashMap<String, Object>();

    private static final String code_success = "200";
    private static final String code_fail = "500";

    // 构造方法
    private MapControl(){};

    /**
     * 在主函数开始时调用，返回一个实例化对象，此对象是static的，
     * 在内存中保留着它的引用，即内存中有一块区域专门用来存放静态方法和变量，
     * 可以直接使用，调用多次返回同一个对象。
     * @return
     */
    public static MapControl getInstance(){
        return new MapControl();
    };


    public Map<String, Object> getMap() {
        return paramMap;
    }

    public MapControl put(String key, Object val) {
        paramMap.put(key, val);
        return this;
    }

    // 重写Map导入方式
    public MapControl put(Map<String, Object> map) {

        for (Map.Entry<String, Object> enty : map.entrySet())
            paramMap.put(enty.getKey(), enty.getValue());
        return this;
    }


    // 操作成功
    public MapControl success(){
         return this.put("code",this.code_success);
    }
    // 操作失败
    public MapControl fail(){
        return this.put("code",this.code_fail);
    }
}
