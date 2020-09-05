package com.atguigu.modemo1010;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu")
@SpringBootApplication
public class Mpdemo1010Application {
    public static void main(String[] args) {
        SpringApplication.run(Mpdemo1010Application.class,args);
        System.out.println("master11111111");
    }
}
