package com.liyuanqing.boot.user.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 其中：@RestController = @Controller + @ResponseBody
 * <p>
 * 而@ResponseBody ： 该注解用于将Controller 的方法返回对象，
 * 通过适当的HttpMessageConverter转换为指定格式后，写入Response对象的body数据区。
 *
 * @Controller 不用解释了
 * <p>
 * 另外：@RequestMapping ：用来处理请求地址映射的注解，可用于类或方法上。
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testOne")
    public String testOne() {
        return "第一个入口";
    }


    @RequestMapping("/testTwo")
    public String testTwo() {
        return "出现分支问题.";
    }

}
