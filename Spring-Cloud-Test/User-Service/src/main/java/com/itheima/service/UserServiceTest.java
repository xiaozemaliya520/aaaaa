package com.itheima.service;

import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void test(){
        String url="http://localhost:8091/user/8";
        User user = restTemplate.getForObject(url, User.class);
        System.out.println(user);
    }
}
