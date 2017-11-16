package com.shao.ray.core.util;

import com.shao.ray.config.properties.RayProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     *
     * @author stylefeng
     * @Date 2017/5/23 22:34
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(RayProperties.class).getKaptchaOpen();
    }
}