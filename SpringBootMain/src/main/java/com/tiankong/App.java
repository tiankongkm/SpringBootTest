package com.tiankong;

import com.alibaba.fastjson.JSON;
import com.tiankong.entity.User;
import com.tiankong.service.StrategyList;
import com.tiankong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.tiankong")
@RestController
@EnableConfigurationProperties(User.class)
public class App 
{

    @Autowired
    private User user;
    @Autowired
    private UserService userService;
    @Autowired
    private StrategyList strategyList;

    @RequestMapping("/user")
    public String test() {
        return JSON.toJSONString(user);
    }

    @RequestMapping("/username")
    public String username() {
        return userService.getUserName();
    }

    @RequestMapping("/defaultStrategy")
    public String defaultStrategy() {
        return strategyList.getDefaultStrategy();
    }

    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
