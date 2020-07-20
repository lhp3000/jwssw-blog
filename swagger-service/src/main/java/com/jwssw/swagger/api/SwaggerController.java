package com.jwssw.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * swagger 控制类
 *
 * @author <a href="mailTo:luhaopeng2005@126.com">Luhaopeng</a>
 * @version 1.0
 * @date 2020/7/11 17:08
 * @since JDK 14
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "SwaggerController|用来演示Swagger注解的控制器")
public class SwaggerController {

    /**
     * hello swagger api
     *
     * @return 字符串
     */
    @GetMapping("/hello")
    @ApiOperation(value = "测试接口", notes = "直接返回Hello Swagger")
    public String helloSwagger() {
        return "Hello Swagger";
    }

    /**
     * 检查用户信息
     *
     * @param userId   用户id
     * @param password 密码
     * @return
     */
    @PostMapping("/checkUserInfo")
    @ApiOperation(value = "校验用户信息", notes = "根据用户id和密码判断当前用户是否合法")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true, dataType =
                    "String"),
            @ApiImplicitParam(paramType = "query", name = "password", value = "用户密码", required = true, dataType =
                    "String")
    })
    public String checkUserInfo(String userId, String password) {
        return "当前用户合法";
    }
}
