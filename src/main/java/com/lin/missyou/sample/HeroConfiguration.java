package com.lin.missyou.sample;

import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.sample.condition.IreliaCondition;
import com.lin.missyou.sample.hero.Camille;
import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

    @Bean
    public ISkill irelia(){
        return new Irelia();
    }

    /*
    @Bean
//    @ConditionalOnBean(name="mysql") // ioc 里有 mysql这个 bean ,就把它 放入容器
    @ConditionalOnMissingBean(name="mysql") // ioc 里 不存在 mysql这个 bean 条件成立
    public ISkill diana(){
        return new Diana();
    }
    */


    /*
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
