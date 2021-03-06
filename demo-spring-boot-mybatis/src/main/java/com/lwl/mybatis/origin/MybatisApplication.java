package com.lwl.mybatis.origin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * author liuweilong
 * date 2019/12/24 6:48 下午
 * desc
 */
@SpringBootApplication
@MapperScan("com.lwl.mybatis.origin.mapper")
@EnableAsync
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}