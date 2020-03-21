package com.lin.missyou;

import com.lin.missyou.sample.ISkill;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class).run(args);

        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
