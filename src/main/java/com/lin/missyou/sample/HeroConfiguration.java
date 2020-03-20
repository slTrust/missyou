package com.lin.missyou.sample;

import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.sample.condition.IreliaCondition;
import com.lin.missyou.sample.hero.Camille;
import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {


    @Bean
    @ConditionalOnProperty(value="hero.condition",havingValue = "diana")
    public ISkill diana(){
        return new Diana();
    }

    @Bean
    @ConditionalOnProperty(value="hero.condition",havingValue = "irelia")
    public ISkill irelia(){
        return new Irelia();
    }
    /*
    @Bean
    @Conditional(DianaCondition.class)
    public ISkill diana(){
        return new Diana();
    }

    @Bean
    @Conditional(IreliaCondition.class)
    public ISkill irelia(){
        return new Irelia();
    }
    */
}
