package com.jwssw.simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * simple service 启动类
 *
 * @author <a href="mailTo:luhaopeng2005@126.com">Luhaopeng</a>
 * @version 1.0
 * @date 2020/7/5 17:25
 * @since JDK 11
 */
@Slf4j
@SpringBootApplication
public class SimpleApplication {
    /**
     * simple service 启动入口
     *
     * @param args 参数集
     */
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
        log.info("本应用已启动");
    }
}
