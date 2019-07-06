package com.tiankong.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass
public class UserService {

    public String getUserName(){
        return "tiankong";
    }
}
