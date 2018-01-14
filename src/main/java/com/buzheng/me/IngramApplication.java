package com.buzheng.me;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@MapperScan(value = "com.buzheng.me.mapper")
@ComponentScan
public class IngramApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngramApplication.class, args);
	}
}
