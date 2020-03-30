package com.lin.missyou.api.v1;

import com.lin.missyou.dto.TokenGetDTO;
import com.lin.missyou.exception.http.NotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "token")
@RestController
public class TokenController {

    @PostMapping("")
    public Map<String,String> getToken(@RequestBody @Validated TokenGetDTO userData){
        Map<String,String> map = new HashMap<>();
        String token = "";

        switch (userData.getLoginType()){
            case USER_WX:
                break;
            case USER_Email:
                // 这里逻辑不写了，就是去 数据库对比 account password 是否符合
                break;
                default:
                    throw new NotFoundException(10003);
        }
        return null;
    }
}