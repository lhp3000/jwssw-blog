package com.jwssw.simple.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 多环境配置文件
 *
 * @author luhaopeng2005@126.com
 * @version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring")
public class MultiEnvironmentConfig {
    private String environment;
}
