package com.lin.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {
    // MVC SpringMVC
    // Controller model view

    @GetMapping("/test0")
    public void test(HttpServletResponse response) throws IOException {
        // http://localhost:8080/test0
        // 看到的是乱码  Hello,??
        response.getWriter().write("Hello,亚瑟");
    }

    @GetMapping("/test")
    @ResponseBody
    public String test2() {
        // 如果是文本 header text/plain
        // 如果是对象 header 会标记 application/json
        return "Hello,亚瑟";
    }
}
