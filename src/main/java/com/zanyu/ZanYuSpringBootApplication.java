package com.zanyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.zanyu.mapper")  //包扫描，加入地址
@SpringBootApplication
public class ZanYuSpringBootApplication {

    public static void main(String[] args){

        SpringApplication.run(ZanYuSpringBootApplication.class,args);
    }
}
