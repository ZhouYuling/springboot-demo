package com.gzhc365.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: ZhouYuling
 * @Description:
 * @Date: Created in 上午 10:27 2019/7/22 0022
 * @Modified by:
 */

@RestController
@RequestMapping("/helloworld")
public class HelloController {

    @RequestMapping("/name")
    public String index(){
        return "I am helloworld";
    }

    @SuppressWarnings("deprecation")
    @RequestMapping("/date")
    String nowDate(){
        return "现在的时间是：" + (new Date()).toLocaleString();
    }

    @GetMapping("/person/{name}/{height}/{address}")
    public String getInfo(@PathVariable String name,@PathVariable Double height, @PathVariable String address){
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    @GetMapping("/person/{name}-{height}-{address}")
    public String getInfo02(@PathVariable String name, @PathVariable Double height, @PathVariable String address){
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    @RequestMapping("/sex")
    public String sex(){
        return "I am helloworld";
    }

    @RequestMapping("/testDevl")
    public String testDevl(){
        return "I am testDevl";
    }

}
