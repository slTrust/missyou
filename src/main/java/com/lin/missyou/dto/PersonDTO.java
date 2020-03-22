package com.lin.missyou.dto;

import com.lin.missyou.validators.PasswordEqual;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Builder
@Getter
@PasswordEqual
public class PersonDTO {
    @Length(min=2,max=10,message = "xxx")
    private String name;
    private Integer age;


    private String password1;
    private String password2;
}

