package com.lin.missyou.api.v1;

import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/banner")
public class BannerController {
//    @Autowired
    private Diana diana;

    @Autowired
    private BannerService service;

    public BannerController(Diana diana){
        this.diana = diana;
    }

    @GetMapping("/test")
    public String test2() {
        diana.q();
        return "Hello,亚瑟";
    }
}
