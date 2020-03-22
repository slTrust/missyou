package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import com.lin.missyou.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


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

    // 获取请求体内容
    @PostMapping("/test4/{id}")
    public String test4(@PathVariable Integer id,
                        @RequestParam String name,
                        @RequestBody Map<String,Object> person){
        // 一般不会用 因为是 Map 会有一个转型问题 处理非常麻烦
        // 在 java里 最好对应一个类 去映射 对应的 字段
        return "id:" + id + ",name:" + name;
    }

    @PostMapping("/test5/{id}")
    public String test5(@PathVariable Integer id,
                        @RequestParam String name,
                        @RequestBody PersonDTO person){
        System.out.println(person.getName() + "," + person.getAge());
        return "id:" + id + ",name:" + name;
    }



}
