package com.lin.missyou.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented // 注解里的注释加入到文档里
@Retention(RetentionPolicy.RUNTIME) // 注解被保留到 runtime阶段
@Target({ElementType.TYPE}) // 用在那些目标
@Constraint(validatedBy = PasswordValidator.class) // 传入注解的关联类 ，可指定多个
public @interface PasswordEqual {

    int min() default 4;

    int max() default 6;

    String message() default "password are not equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
