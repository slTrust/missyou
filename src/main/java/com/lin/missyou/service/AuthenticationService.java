package com.lin.missyou.service;

import com.lin.missyou.dto.TokenGetDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
//    Authorize

    public void getTokenByEmail(TokenGetDTO userData) {

    }

    public void validateByWx(TokenGetDTO userData) {
        // 通过微信校验
    }

    public void register() {
        // 邮箱 注册
    }
}