package com.lin.missyou.api.v1;

import com.lin.missyou.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/banner")
public class BannerController {

    @GetMapping("/test/{id}")
    public String test1(@PathVariable Integer id){
        return id + "";
    }

    @GetMapping("/test2/{id1}")
    public String test2(@PathVariable(name="id1") Integer id){
        return id + "";
    }

    @GetMapping("/test3/{id}")
    public String test3(@PathVariable Integer id, @RequestParam String name){
        return "id:" + id + ",name:" + name;
    }



}
