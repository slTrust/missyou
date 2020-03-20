package com.lin.missyou.api.v1;

import com.lin.missyou.sample.IConnect;
import com.lin.missyou.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @Autowired
    private ISkill camille;

    @Autowired
    private IConnect iConnect;

    @GetMapping("/test")
    public String test2() {
        camille.q();
        return "Hello,亚瑟";
    }

    @GetMapping("/test_sql")
    public String test_sql() {
        iConnect.connect();
        return "Hello,sql";
    }



}
