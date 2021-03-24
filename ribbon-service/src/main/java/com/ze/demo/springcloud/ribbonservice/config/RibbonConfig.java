package com.ze.demo.springcloud.ribbonservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Gze
 * @ClassName:RibbonConfig
 * @Description: TODO
 * @date 2021/3/24 15:45
 * 注意：本内容仅限于全民通科技内部传阅，禁止外泄以及用于其他的商业目
 */
@Configuration
public class RibbonConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
