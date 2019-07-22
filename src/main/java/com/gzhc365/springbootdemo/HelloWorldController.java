package com.gzhc365.springbootdemo;

import com.gzhc365.utils.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaoxinguo on 2017/8/21.
 */
@RestController //提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果。
@RequestMapping("/log4j")
public class HelloWorldController {
 
    private Logger logger = LoggerFactory.getLogger("weather");
 
    @RequestMapping(value = "/log4jTest",method = RequestMethod.GET) //可以替换为@GetMapping("/user")
    public String sayHello(HttpServletRequest request){
        String ipAddr = IpUtil.getIpAddr(request);
        logger.info("hello user:" + ipAddr);
        return "Hello,World!";
    }
 
}