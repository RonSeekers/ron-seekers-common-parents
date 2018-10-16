package com.ron.seekers.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope public class TestRefreshController {


    @Value("${myww}") // git配置文件里的key
            String myww;

    @RequestMapping(value = "/hi")
    public String hi() {
        return this.myww;
    }
}
