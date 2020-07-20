package com.jwssw.simple.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 多环境配置类
 *
 * @author <a href="mailTo:luhaopeng2005@126.com">Luhaopeng</a>
 * @version 1.0
 * @date 2020/7/5 17:59
 * @since JDK 1.8
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring")
public class MultiEnvironmentConfig {
    private String environment;
}
