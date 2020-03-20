package com.lin.missyou.sample;

import com.lin.missyou.sample.hero.Camille;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

    @Bean
    public ISkill camille(){
        return new Camille();
    }
}
