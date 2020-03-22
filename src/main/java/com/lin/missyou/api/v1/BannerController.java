package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @PostMapping("/test/{id}")
    public PersonDTO test5(@PathVariable @Range(min = 1,max= 10,message = "不能大于10小于1") Integer id,
                        @RequestParam String name,
                        @RequestBody @Validated PersonDTO person){
        PersonDTO dto = PersonDTO.builder()
                .name(person.getName())
                .age(person.getAge())
                .build();
        return dto;
    }

}
