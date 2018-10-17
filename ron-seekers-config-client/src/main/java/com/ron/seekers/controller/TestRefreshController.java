package com.ron.seekers.controller;

import com.ron.seekers.util.HttpConnect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@RefreshScope
public class TestRefreshController {


    @Value("${myww}") // git配置文件里的key
     String myww;



    @GetMapping(value = "/hi")
    public String hi() {
            System.out.println(myww);
        return "你好："+myww;
    }


}
