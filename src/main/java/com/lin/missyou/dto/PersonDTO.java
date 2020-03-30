package com.lin.missyou.dto;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Builder
@Getter
public class PersonDTO {
    @Length(min=2,max=10,message = "xxx")
    private String name;
    private Integer age;


    private String password1;
    private String password2;
}

