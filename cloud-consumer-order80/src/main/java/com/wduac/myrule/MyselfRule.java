package com.wduac.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author wduac
 * @date 2021/2/19 - 23:32
 */
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
