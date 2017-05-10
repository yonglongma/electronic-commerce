package com.yonglong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaYongLong
 * @date 2017/5/3.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/hello")
    String home(){
        return "hello world";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Example.class,args);
    }
}
