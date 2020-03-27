package com.lin.missyou.api.v1;

import com.lin.missyou.vo.CategoriesAllVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("category")
@RestController
@ResponseBody
public class CategoryController {

    @GetMapping("/all")
    public CategoriesAllVO getAll(){
        // List 如何处理？
        return null;
    }
}
