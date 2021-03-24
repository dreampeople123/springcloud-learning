//package com.ze.demo.springcloud.eurekaserver.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author Gze
// * @ClassName:WebSecurityConfig
// * @Description: TODO
// * @date 2021/3/24 14:02
// * 注意：本内容仅限于全民通科技内部传阅，禁止外泄以及用于其他的商业目
// */
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().ignoringAntMatchers("/eureka/**");
//        super.configure(http);
//    }
//}
