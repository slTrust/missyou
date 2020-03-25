package com.lin.missyou.api.v1;

import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.model.Banner;
import com.lin.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable @NotBlank String name){
        Banner banner = bannerService.getByName(name);
        if(banner == null){
            throw new NotFoundException(30005);
        }
        return banner;
    }
}
