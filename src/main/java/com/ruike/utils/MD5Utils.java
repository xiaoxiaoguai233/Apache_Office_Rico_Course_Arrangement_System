package com.ruike.utils;

import org.springframework.util.DigestUtils;

/**
 * @author 吴泽胜
 * @FileName MD5Utils
 * @date 2020-11-12 2:03 下午
 * @Software: IntelliJ IDEA
 */

/**
 * 加密MD5密码工具类
 */
public class MD5Utils {

    // 盐
    private static final String solt = "rike/**-123.-+";

    public static String getMD5(String string){
        String val = string + solt;
        return DigestUtils.md5DigestAsHex(val.getBytes());
    }

    /**
     *  test
     * @param args
     */
    public static void main(String[] args) {
        String md5 = new MD5Utils().getMD5("123456");
        System.out.println(md5 + "    " + md5.length());
    }
}
