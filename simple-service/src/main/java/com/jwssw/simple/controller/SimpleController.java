package com.jwssw.simple.controller;

import com.jwssw.simple.config.MultiEnvironmentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单服务 控制类
 *
 * @author <a href="mailTo:luhaopeng2005@126.com">Luhaopeng</a>
 * @version 1.0
 * @date 2020/7/5 18:00
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/simple")
public class SimpleController {

    /**
     * 多环境配置类
     */
    @Autowired
    private MultiEnvironmentConfig config;

    /**
     * 获取当前环境
     *
     * @return 当前环境
     */
    @GetMapping("/getEnvironment")
    public String getEnvironment() {
        return "{\"environment\": \"" + config.getEnvironment() + "\"}";
    }
}
