package com.codegym.login.configuraton.security;

import com.codegym.login.service.UserService;
import com.codegym.login.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {
    public static final String LOGIN = "/login";

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Autowired
    private UserService userService;

    @Bean(BeanIds.AUTHENTICATION_MANAGER)


    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
}
