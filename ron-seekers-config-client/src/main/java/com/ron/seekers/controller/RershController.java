package com.ron.seekers.controller;

import com.ron.seekers.util.HttpConnect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class RershController {
    @Value("${refushConfigUrl}")
    String refushConfigUrl;

    @PostMapping(value = "/refush")
    public String quartzRefreConfig() {
        String res = null;
        try {
            res = HttpConnect.send(refushConfigUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(res);
        return res;
    }
}
