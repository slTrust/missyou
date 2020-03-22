package com.lin.missyou.validators;

import com.lin.missyou.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    /*
    ConstraintValidator<> 是一个泛型接口
    接受两个参数
        第一个是 自定义注解类型 PasswordEqual
        第二个是 这个自定义注解 PasswordEqual 修饰的 目标类型，你要校验哪个DTO 你就加在谁身上（PersonDTO）
    实现 isValid 方法 具体的校验逻辑
    */

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean match = password1.equals(password2);
        return match;
    }


}
