package com.lin.missyou;

import com.lin.missyou.sample.HeroConfiguration;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.hero.LOLConfigurationSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//@ComponentScan
//@Import(HeroConfiguration.class)
@Import(LOLConfigurationSelector.class)
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
