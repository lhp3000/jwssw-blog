package com.jwssw.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * swagger 配置类
 * 在与spring boot集成时，放在与Application.java同级的目录下
 * 通过@Configuration注解，让spring来加载该类配置。
 * 再通过@EnableSwagger2WebMvc注解启动Swagger。
 *
 * @author <a href="mailTo:luhaopeng2005@126.com">Luhaopeng</a>
 * @version 1.0
 * @date 2020/7/11 17:12
 * @since JDK 1.8
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    /**
     * 创建API应用
     * <pre>
     *     apiInfo() 增加API相关信息
     *     通过select()方法返回一个ApiSelectorBuilder实例，用来控制哪些接口暴漏给Swagger来展现
     *     本例采用制定扫描的包路径来定义指定要建立API的目录
     * </pre>
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 自定义Swagger API的信息（注：这些信息会展示在Swagger API文档预览页面上）
     * Swagger访问地址：http://127.0.0.1:8080/swagger-ui.html
     *
     * @return ApiInfo对象
     */
    private ApiInfo apiInfo() {
        // 调用Swagger ApiInfo的builder模式创建ApiInfo类
        return new ApiInfoBuilder()
                // 添加标题
                .title("Spring boot Swagger Api 文档")
                // 添加描述
                .description("这是一个Spring boot restful api接口文档说明。")
                // api联系人员信息
                .contact(new Contact("Luhaopeng", "https://www.jwssw.com.cn", "luhaopeng2005@126.com"))
                // 添加当前api版本号
                .version("1.0")
                // 创建ApiInfo类
                .build();
    }
}
