package com.lin.missyou.service;

import org.springframework.stereotype.Service;

@Service
public class WxAuthenticationService {

    public String code2Session(String code) {
        // 微信进入到 小程序 会发送一个 code码  无法postman模拟
        return null;
    }

}
