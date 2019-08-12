package com.deschen.restful.restfuldemo;

import com.deschen.restful.restfuldemo.mapper.UserMapper;
import com.deschen.restful.restfuldemo.pojo.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.deschen.restful.restfuldemo.mapper")
public class RestfulDemoApplication {

    @Bean
    InitializingBean saveData(UserMapper userMapper){
        return ()->{
            User user = new User();
            for (long i = 0; i <= 10L; i++) {
                user.setId(i);
                user.setName("张三" + i + "号");
                user.setAge(13);
                user.setEmail("123.qq.com");
                userMapper.insert(user);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RestfulDemoApplication.class, args);
    }

}
